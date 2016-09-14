package dropwizard.model;

import java.math.BigDecimal;
import java.util.Date;
//暂时没有使用
public class Investments {
	long id;
	long fundingRoundId;	//轮次id，对应FundingRounds表
	long fundedObjectId;	//公司id
	long investorObjectId;	//基金公司id
	Date createdAt;
	Date updatedAt;
}
