package jdbi.dao;

import java.util.List;

import jdbi.mapper.CompanyMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import dropwizard.model.Company;
@RegisterMapper(CompanyMapper.class)
public interface CompanyDAO {
	@Mapper(CompanyMapper.class)
	@SqlQuery("select * from mada.cb_objects where id = :id")
	List<Company> findById(@Bind("id") String id);

	@Mapper(CompanyMapper.class)
	@SqlQuery("select * from mada.cb_objects where funding_rounds > :round")
	List<Company> findFundRoundsLargerThan(@Bind("round") int round);

	 /**
	 * close with no args is used to close the connection
	 */ 
	void close();
}
