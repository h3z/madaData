package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//暂时没有使用
public class Offices {
	long id;
	String objectId;
	long officeId;
	String description;
	String region;
	String address1;
	String address2;
	String city;
	String zipCode;
	String stateCode;
	String countryCode;
	BigDecimal latitude;
	BigDecimal longitude;
	Date createdAt;
	Date updatedAt;
}
