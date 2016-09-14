package dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jdbi.dao.PeopleDAO;

import org.skife.jdbi.v2.DBI;

import dropwizard.model.People;

@Path("/restfulAPI/people/{id}")
public class PeopleResource {
	private PeopleDAO peopleDAO;
	
	public PeopleResource(DBI jdbi){
		peopleDAO = jdbi.onDemand(PeopleDAO.class);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public People receiveHello(@PathParam("id") String id) {
		return peopleDAO.findByObjId(id);
	}
}