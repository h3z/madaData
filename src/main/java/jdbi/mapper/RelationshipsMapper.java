package jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import dropwizard.model.People;
import dropwizard.model.Relationships;

public class RelationshipsMapper implements ResultSetMapper<Relationships> {
    public Relationships map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
    	Relationships relationship = new Relationships();
    	relationship.setId(resultSet.getLong("id"));
    	relationship.setRelationshipId(resultSet.getLong("relationship_id"));
    	relationship.setPersonObjectId(resultSet.getString("person_object_id"));
    	relationship.setRelationshipObjectId(resultSet.getString("relationship_object_id"));
    	relationship.setStartAt(""+resultSet.getDate("start_at"));
    	relationship.setEndAt(""+resultSet.getDate("end_at"));
    	relationship.setIsPast(resultSet.getInt("is_past"));
    	relationship.setSequence(resultSet.getInt("sequence"));
    	relationship.setTitle(resultSet.getString("title"));
    	return relationship;
    }
	
	
}


