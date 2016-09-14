package dropwizard.model;

import java.util.Date;

public class Relationships {
	private long id;
	private long relationshipId;
	private String personObjectId;
	private String relationshipObjectId;
	private String startAt;
	private String endAt;
	private int isPast;
	private int sequence;
	private String title;
	private Date createdAt;
	private Date updatedAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRelationshipId() {
		return relationshipId;
	}
	public void setRelationshipId(long relationshipId) {
		this.relationshipId = relationshipId;
	}
	public String getPersonObjectId() {
		return personObjectId;
	}
	public void setPersonObjectId(String personObjectId) {
		this.personObjectId = personObjectId;
	}
	public String getRelationshipObjectId() {
		return relationshipObjectId;
	}
	public void setRelationshipObjectId(String relationshipObjectId) {
		this.relationshipObjectId = relationshipObjectId;
	}
	public String getStartAt() {
		return startAt;
	}
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	public String getEndAt() {
		return endAt;
	}
	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}
	public int getIsPast() {
		return isPast;
	}
	public void setIsPast(int isPast) {
		this.isPast = isPast;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	@Override
	public String toString() {
		return "Relationships [id=" + id + ", relationshipId=" + relationshipId
				+ ", personObjectId=" + personObjectId
				+ ", relationshipObjectId=" + relationshipObjectId
				+ ", startAt=" + startAt + ", endAt=" + endAt + ", isPast="
				+ isPast + ", sequence=" + sequence + ", title=" + title
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
}
