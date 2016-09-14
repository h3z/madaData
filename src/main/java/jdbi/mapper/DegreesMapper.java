package jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import dropwizard.model.Degrees;

public class DegreesMapper implements ResultSetMapper<Degrees> {

    public Degrees map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
    	Degrees degree = new Degrees();
    	degree.setId(resultSet.getLong("id"));
    	degree.setObjectId(resultSet.getString("object_id"));
    	degree.setDegreeType(resultSet.getString("degree_type"));
    	degree.setSubject(resultSet.getString("subject"));
    	degree.setInstitution(resultSet.getString("institution"));
    	degree.setGraduatedAt(""+resultSet.getDate("graduated_at"));
    	return degree;
    }
}

