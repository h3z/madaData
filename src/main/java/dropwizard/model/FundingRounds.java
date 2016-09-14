package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//暂时没有使用
public class FundingRounds {
	long id;
	long fundingRoundId;
	String objectId;//公司id
	Date fundedAt;	//获得于
	String fundingRoundType; //类型
	String fundingRoundCode; //code
	BigDecimal raisedAmountUsd; //募集金额
	BigDecimal preMoneyValuationUsd; //投前估值
	BigDecimal postMoneyValuationUsd; //投后估值
	int participants; //人数
	int isFirstRound; //首轮
	int isLastRound; //尾轮
	String sourceUrl;
	String sourceDescription;
	Date createdAt;
	Date updatedAt;
}
