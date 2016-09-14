package jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import dropwizard.model.Company;

public class CompanyMapper implements ResultSetMapper<Company> {

    public Company map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
    	Company company = new Company();
    	company.setId(resultSet.getString("id"));
    	company.setName(resultSet.getString("name"));
    	company.setNormalizedName(resultSet.getString("normalized_name"));
    	company.setCategoryCode(resultSet.getString("category_code"));
    	company.setStatus(resultSet.getString("status"));
    	company.setFoundedAt(resultSet.getString("founded_at"));
    	company.setClosedAt(resultSet.getString("closed_at"));
    	company.setDomain(resultSet.getString("domain"));
    	company.setHomepageUrl(resultSet.getString("homepage_url"));
    	company.setTwitterUsername(resultSet.getString("twitter_username"));
    	company.setLogoUrl(resultSet.getString("logo_url"));
    	company.setLogoWidth(resultSet.getInt("logo_width"));
    	company.setLogoHeight(resultSet.getInt("logo_height"));
    	company.setShortDescription(resultSet.getString("short_description"));
    	company.setDescription(resultSet.getString("description"));
    	company.setOverview(resultSet.getString("overview"));
    	company.setTagList(resultSet.getString("tag_list"));
    	company.setCountryCode(resultSet.getString("country_code"));
    	company.setStateCode(resultSet.getString("state_code"));
    	company.setCity(resultSet.getString("city"));
    	company.setRegion(resultSet.getString("region"));
    	company.setFirstInvestmentAt(resultSet.getString("first_investment_at"));
    	company.setLastInvestmentAt(resultSet.getString("last_investment_at"));
    	company.setInvestmentRounds(resultSet.getInt("investment_rounds"));
    	company.setInvestedCompanies(resultSet.getInt("invested_companies"));
    	company.setFirstFundingAt(resultSet.getString("first_funding_at"));
    	company.setLastFundingAt(resultSet.getString("last_funding_at"));
    	company.setMilestones(resultSet.getInt("milestones"));
    	company.setRelationships(resultSet.getInt("relationships"));
    	return company;
    }
	
	
}

