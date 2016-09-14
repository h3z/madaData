package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Objects {
	private String id;
	private String entityType;
	private long entityId;
	private String parentId;
	private String name;
	private String normalizedName;
	private String permalink;
	private String categoryCode;
	private String status;
	private Date foundedAt;
	private Date closedAt;
	private String domain;
	private String homepageUrl;
	private String twitterUsername;
	private String logoUrl;
	private int logoWidth;
	private int logoHeight;
	private String shortDescription;
	private String description;
	private String overview;
	private String tagList;
	private String countryCode;
	private String stateCode;
	private String city;
	private String region;
	private Date firstInvestmentAt;
	private Date lastInvestmentAt;
	private int investmentRounds;
	private int investedCompanies;
	private Date firstFundingAt;
	private Date lastFundingAt;
	private int fundingRounds;
	private BigDecimal fundingTotalUsd;
	private Date firstMilestoneAt;
	private Date lastMilestoneAt;
	private int milestones;
	
	private List<People> memberlist;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public long getEntityId() {
		return entityId;
	}
	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNormalizedName() {
		return normalizedName;
	}
	public void setNormalizedName(String normalizedName) {
		this.normalizedName = normalizedName;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getFoundedAt() {
		return foundedAt;
	}
	public void setFoundedAt(Date foundedAt) {
		this.foundedAt = foundedAt;
	}
	public Date getClosedAt() {
		return closedAt;
	}
	public void setClosedAt(Date closedAt) {
		this.closedAt = closedAt;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getHomepageUrl() {
		return homepageUrl;
	}
	public void setHomepageUrl(String homepageUrl) {
		this.homepageUrl = homepageUrl;
	}
	public String getTwitterUsername() {
		return twitterUsername;
	}
	public void setTwitterUsername(String twitterUsername) {
		this.twitterUsername = twitterUsername;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public int getLogoWidth() {
		return logoWidth;
	}
	public void setLogoWidth(int logoWidth) {
		this.logoWidth = logoWidth;
	}
	public int getLogoHeight() {
		return logoHeight;
	}
	public void setLogoHeight(int logoHeight) {
		this.logoHeight = logoHeight;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getTagList() {
		return tagList;
	}
	public void setTagList(String tagList) {
		this.tagList = tagList;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Date getFirstInvestmentAt() {
		return firstInvestmentAt;
	}
	public void setFirstInvestmentAt(Date firstInvestmentAt) {
		this.firstInvestmentAt = firstInvestmentAt;
	}
	public Date getLastInvestmentAt() {
		return lastInvestmentAt;
	}
	public void setLastInvestmentAt(Date lastInvestmentAt) {
		this.lastInvestmentAt = lastInvestmentAt;
	}
	public int getInvestmentRounds() {
		return investmentRounds;
	}
	public void setInvestmentRounds(int investmentRounds) {
		this.investmentRounds = investmentRounds;
	}
	public int getInvestedCompanies() {
		return investedCompanies;
	}
	public void setInvestedCompanies(int investedCompanies) {
		this.investedCompanies = investedCompanies;
	}
	public Date getFirstFundingAt() {
		return firstFundingAt;
	}
	public void setFirstFundingAt(Date firstFundingAt) {
		this.firstFundingAt = firstFundingAt;
	}
	public Date getLastFundingAt() {
		return lastFundingAt;
	}
	public void setLastFundingAt(Date lastFundingAt) {
		this.lastFundingAt = lastFundingAt;
	}
	public int getFundingRounds() {
		return fundingRounds;
	}
	public void setFundingRounds(int fundingRounds) {
		this.fundingRounds = fundingRounds;
	}
	public BigDecimal getFundingTotalUsd() {
		return fundingTotalUsd;
	}
	public void setFundingTotalUsd(BigDecimal fundingTotalUsd) {
		this.fundingTotalUsd = fundingTotalUsd;
	}
	public Date getFirstMilestoneAt() {
		return firstMilestoneAt;
	}
	public void setFirstMilestoneAt(Date firstMilestoneAt) {
		this.firstMilestoneAt = firstMilestoneAt;
	}
	public Date getLastMilestoneAt() {
		return lastMilestoneAt;
	}
	public void setLastMilestoneAt(Date lastMilestoneAt) {
		this.lastMilestoneAt = lastMilestoneAt;
	}
	public int getMilestones() {
		return milestones;
	}
	public void setMilestones(int milestones) {
		this.milestones = milestones;
	}
	public int getRelationships() {
		return relationships;
	}
	public void setRelationships(int relationships) {
		this.relationships = relationships;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	private int relationships;
	private Date createdAt;
	private Date updatedAt;
}
