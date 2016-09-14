package jdbi.dao;

import jdbi.mapper.PeopleMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import dropwizard.model.People;
@RegisterMapper(PeopleMapper.class)
public interface PeopleDAO {
	@Mapper(PeopleMapper.class)
	@SqlQuery("select * from mada.cb_people where object_id = :objId")
	People findByObjId(@Bind("objId") String objId);

	 /**
	 * close with no args is used to close the connection
	 */ 
	void close();
}
