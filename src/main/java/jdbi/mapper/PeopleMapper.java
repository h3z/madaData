package jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import dropwizard.model.People;

public class PeopleMapper implements ResultSetMapper<People> {

    public People map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
    	People people = new People();
    	people.setId(resultSet.getLong("id"));
    	people.setFirstName(resultSet.getString("first_name"));
    	people.setLastName(resultSet.getString("last_name"));
    	people.setObjectId(resultSet.getString("object_id"));
    	people.setBirthplace(resultSet.getString("birthplace"));
    	people.setAffiliationName(resultSet.getString("affiliation_name"));
    	return people;
    }
	
	
}

