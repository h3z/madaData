package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;

public class Degrees {
	private long id;
	private String objectId;	//�˵�id����Ӧobject��
	private String degreeType;	//ѧλ����
	private String subject;		//����
	private String institution;	//ԺУ
	private String graduatedAt;	//��ҵ��
	private Date createdAt;
	private Date updatedAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getGraduatedAt() {
		return graduatedAt;
	}
	public void setGraduatedAt(String graduatedAt) {
		this.graduatedAt = graduatedAt;
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
		return "Degrees [id=" + id + ", objectId=" + objectId + ", degreeType="
				+ degreeType + ", subject=" + subject + ", institution="
				+ institution + ", graduatedAt=" + graduatedAt + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
}
