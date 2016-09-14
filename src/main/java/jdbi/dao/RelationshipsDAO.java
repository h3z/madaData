package jdbi.dao;

import java.util.List;

import jdbi.mapper.RelationshipsMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import dropwizard.model.Relationships;
@RegisterMapper(RelationshipsMapper.class)
public interface RelationshipsDAO {
	@Mapper(RelationshipsMapper.class)
	@SqlQuery("select * from mada.cb_relationships where relationship_object_id = :cid")
	List<Relationships> findByCompanyId(@Bind("cid") String cid);

	 /**
	 * close with no args is used to close the connection
	 */ 
	void close();
}
