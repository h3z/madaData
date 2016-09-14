package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//��ʱû��ʹ��
public class FundingRounds {
	long id;
	long fundingRoundId;
	String objectId;//��˾id
	Date fundedAt;	//�����
	String fundingRoundType; //����
	String fundingRoundCode; //code
	BigDecimal raisedAmountUsd; //ļ�����
	BigDecimal preMoneyValuationUsd; //Ͷǰ��ֵ
	BigDecimal postMoneyValuationUsd; //Ͷ���ֵ
	int participants; //����
	int isFirstRound; //����
	int isLastRound; //β��
	String sourceUrl;
	String sourceDescription;
	Date createdAt;
	Date updatedAt;
}
