package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//��ʱû��ʹ��
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
