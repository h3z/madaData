package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//��ʱû��ʹ��
public class Investments {
	long id;
	long fundingRoundId;	//�ִ�id����ӦFundingRounds��
	long fundedObjectId;	//��˾id
	long investorObjectId;	//����˾id
	Date createdAt;
	Date updatedAt;
}
