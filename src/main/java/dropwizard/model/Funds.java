package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//暂时没有使用
public class Funds {
	long id;
	long fundId;		//基金id
	long objectId;
	String name;
	Date fundedAt;
	BigDecimal raisedAmount; //金额
	String sourceUrl;
	String sourceDescription;
	Date createdAt;
	Date updatedAt;
}
