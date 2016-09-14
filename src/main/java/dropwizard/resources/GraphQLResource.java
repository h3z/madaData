package dropwizard.resources;

import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;
import graphql.GraphQL;
import graphql.Scalars;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLNonNull;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLOutputType;
import graphql.schema.GraphQLSchema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.skife.jdbi.v2.DBI;

import dropwizard.model.Company;
import dropwizard.model.Degrees;
import dropwizard.model.People;
import dropwizard.model.Relationships;
import jdbi.dao.CompanyDAO;
import jdbi.dao.DegreesDAO;
import jdbi.dao.PeopleDAO;
import jdbi.dao.RelationshipsDAO;

@Path("/query/{query}")
public class GraphQLResource {

	private static GraphQLOutputType degreeType;
	private static GraphQLOutputType companyType;
	private static GraphQLOutputType peopleType;
	private static GraphQLOutputType relationType;
	private static GraphQLSchema schema;
	private static CompanyDAO companyDAO;
	private static RelationshipsDAO relationshipsDAO;
	private static PeopleDAO peopleDAO;
	private static DegreesDAO degreesDAO;
	
	public GraphQLResource(final DBI jdbi) {
		super();
		companyDAO = jdbi.onDemand(CompanyDAO.class);
		relationshipsDAO = jdbi.onDemand(RelationshipsDAO.class);
		peopleDAO = jdbi.onDemand(PeopleDAO.class);
		degreesDAO = jdbi.onDemand(DegreesDAO.class);
		initType();
		
		List<GraphQLArgument> argList = new ArrayList<GraphQLArgument>();
		argList.add(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLString).build());
		argList.add(GraphQLArgument.newArgument().name("roundsLargerThan").type(Scalars.GraphQLInt).build());
		GraphQLFieldDefinition companyQuery = GraphQLFieldDefinition.newFieldDefinition()
    			.name("companyQuery")
    			.argument(argList)
    			.type(new GraphQLList(companyType))
				.dataFetcher(new DataFetcher(){
					public Object get(DataFetchingEnvironment environment) {
						if (environment.getArgument("id") != null){
							String id = environment.getArgument("id");
							return companyDAO.findById(id);	
						}
						if (environment.getArgument("roundsLargerThan") != null){
							int round = environment.getArgument("roundsLargerThan");
							return companyDAO.findFundRoundsLargerThan(round);	
						}
						return null;
					}
				})
    			.build();
		
		
        GraphQLObjectType queryType = newObject()
        				.name("query")
                        .field(companyQuery)
                        .build();

         schema = GraphQLSchema.newSchema()
                        .query(queryType)
                        .build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Object receiveHello(@PathParam("query") String query) {
		 Map<String, Object> result = (Map<String, Object>) new GraphQL(schema).execute(query).getData();
//		 System.out.println(result);
		 return result;
	}
	
	private static void initType(){
		degreeType = newObject()
				.name("degree")
				.field(newFieldDefinition().name("id").type(Scalars.GraphQLLong).build())
				.field(newFieldDefinition().name("objectId").type(Scalars.GraphQLString).build())
				.field(newFieldDefinition().name("degreeType").type(Scalars.GraphQLString).build())
				.field(newFieldDefinition().name("subject").type(Scalars.GraphQLString).build())
				.field(newFieldDefinition().name("institution").type(Scalars.GraphQLString).build())
				.field(newFieldDefinition().name("graduatedAt").type(Scalars.GraphQLString).build())
				.build();
		
    	peopleType = newObject()
                .name("people")
                .field(newFieldDefinition().name("id").type(Scalars.GraphQLLong).build())
                .field(newFieldDefinition().name("objectId").type(GraphQLString).build())
                .field(newFieldDefinition().name("firstName").type(GraphQLString).build())
                .field(newFieldDefinition().name("lastName").type(GraphQLString).build())
                .field(newFieldDefinition().name("birthplace").type(GraphQLString).build())
                .field(newFieldDefinition().name("affiliationName").type(GraphQLString).build())
                .field(newFieldDefinition().name("degree").type(degreeType)
                		.dataFetcher(new DataFetcher(){
							public Object get(
									DataFetchingEnvironment environment) {
								People people = (People)environment.getSource();
								return degreesDAO.findByPeopleId(people.getObjectId());
							}
                		}).build())
                .build();
    	
    	relationType = newObject()
                .name("relation")
                .field(newFieldDefinition().name("id").type(Scalars.GraphQLLong).build())
                .field(newFieldDefinition().name("relationshipId").type(Scalars.GraphQLLong).build())
                .field(newFieldDefinition().name("personObjectId").type(GraphQLString).build())
                .field(newFieldDefinition().name("peopleInfo").type(peopleType)
                		.dataFetcher(new DataFetcher(){
							public Object get(
									DataFetchingEnvironment environment) {
								Relationships relationships = (Relationships)environment.getSource();
								return peopleDAO.findByObjId(relationships.getPersonObjectId());
							}
                		}).build())
                .field(newFieldDefinition().name("relationshipObjectId").type(GraphQLString).build())
                .field(newFieldDefinition().name("startAt").type(GraphQLString).build())
                .field(newFieldDefinition().name("endAt").type(GraphQLString).build())
                .field(newFieldDefinition().name("isPast").type(Scalars.GraphQLInt).build())
                .field(newFieldDefinition().name("sequence").type(Scalars.GraphQLInt).build())
                .field(newFieldDefinition().name("title").type(GraphQLString).build())
                .build();

    	companyType = newObject()
    			.name("companyType")
    			.description("company info")
    			.field(newFieldDefinition().name("id").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("name").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("normalizedName").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("categoryCode").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("status").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("foundedAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("closedAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("domain").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("homepageUrl").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("twitterUsername").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("logoUrl").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("logoWidth").type(Scalars.GraphQLInt).build())
    			.field(newFieldDefinition().name("logoHeight").type(Scalars.GraphQLInt).build())
    			.field(newFieldDefinition().name("shortDescription").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("description").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("overview").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("tagList").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("countryCode").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("stateCode").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("city").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("region").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("firstInvestmentAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("lastInvestmentAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("investmentRounds").type(Scalars.GraphQLInt).build())
    			.field(newFieldDefinition().name("investedCompanies").type(Scalars.GraphQLInt).build())
    			.field(newFieldDefinition().name("firstFundingAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("lastFundingAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("fundingRounds").type(Scalars.GraphQLInt).build())
    			.field(newFieldDefinition().name("fundingTotalUsd").type(Scalars.GraphQLBigDecimal).build())
    			.field(newFieldDefinition().name("firstMilestoneAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("lastMilestoneAt").type(Scalars.GraphQLString).build())
    			.field(newFieldDefinition().name("milestones").type(Scalars.GraphQLInt).build())
    			.field(newFieldDefinition().name("relationships").type(Scalars.GraphQLInt).build())
    			.field(newFieldDefinition().name("relationList")
    					.type(new GraphQLList(relationType))
    					.dataFetcher(new DataFetcher(){
							public Object get(
									DataFetchingEnvironment environment) {
								Company company = (Company)environment.getSource();
								return relationshipsDAO.findByCompanyId(company.getId());
							}
    					})
    					.build())
    			.build();
    }
}
