package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//暂时没有使用
public class Acquisitions {
	long id;
	long acquisitionId;
	String acquiringObjectId;
	String acquiredgObjectId;
	String temCode;
	BigDecimal priceAmount; 
	String priceCurrencyCode;
	Date acquiredAt;
	String sourceUrl;
	String sourceDescription;
	Date createdAt;
	Date updatedAt;
}
