package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//��ʱû��ʹ��
public class Funds {
	long id;
	long fundId;		//����id
	long objectId;
	String name;
	Date fundedAt;
	BigDecimal raisedAmount; //���
	String sourceUrl;
	String sourceDescription;
	Date createdAt;
	Date updatedAt;
}
