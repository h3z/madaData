package dropwizard.model;


public class People {
	private long id;
	private String objectId;
	private String firstName;
	private String lastName;
	private String birthplace;
	private String affiliationName;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getAffiliationName() {
		return affiliationName;
	}
	public void setAffiliationName(String affiliationName) {
		this.affiliationName = affiliationName;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", objectId=" + objectId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", birthplace="
				+ birthplace + ", affiliationName=" + affiliationName + "]";
	}
	
}
