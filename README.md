# 在此处输入标题
### 1. 配置和启动
1. configuration.yml中数据库连接配置要改成本地的;
2. 数据库名称改成mada，或者把代码中的，比如
```
@SqlQuery("select * from mada.cb_objects where id = :id")
```
mada替换为本地数据库名称;
3. 在项目根目录下运行mvn package;
4. 在项目根目录下运行。 `java -jar target/mada-0.0.1-SNAPSHOT.jar server configuration.yml`;
5. 访问`127.0.0.1:8080/query/{graphqlQueryString}`查询。


### 2. 测试
1. 功能：查询所有通过x轮融资的公司，以及其成员信息，成员的学位信息。
	* 所有字段查询：
```    
{
    //查询融资两轮以上的，也就是过了B轮的。或者company(id:"c1")查询id为c:1的。 )
    company(roundsLargerThan:2){
        name,
        normalizedName,
        categoryCode,
        status,
        foundedAt,
        closedAt,
        domain,
        homepageUrl,
        twitterUsername,
        logoUrl,
        logoWidth,
        logoHeight,
        shortDescription,
        description,
        overview,
        tagList,
        countryCode,
        stateCode,
        city,
        region,
        firstInvestmentAt,
        lastInvestmentAt,
        investmentRounds,
        investedCompanies,
        firstFundingAt,
        lastFundingAt,
        fundingRounds,
        fundingTotalUsd,
        firstMilestoneAt,
        lastMilestoneAt,
        milestones,
        relationships,
        //成员关系
        relationList{
            id,
            relationshipId,
            personObjectId,
            relationshipObjectId,
            startAt,
            endAt,
            isPast,
            sequence,
            title,
            //成员的具体信息
            peopleInfo{
                id,
                objectId,
                firstName,
                lastName,
                birthplace,
                affiliationName,
                //学位信息
                degree{
                    id,
                    objectId,
                    degreeType,
                    subject,
                    institution,
                    graduatedAt
            }
        }
    }
}
```

