package jdbi.dao;

import jdbi.mapper.DegreesMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import dropwizard.model.Company;
import dropwizard.model.Degrees;
@RegisterMapper(DegreesMapper.class)
public interface DegreesDAO {
	@Mapper(DegreesMapper.class)
	@SqlQuery("select * from mada.cb_degrees where object_id = :id")
	Degrees findByPeopleId(@Bind("id") String id);

	 /**
	 * close with no args is used to close the connection
	 */ 
	void close();
}
