# �ڴ˴��������
### 1. ���ú�����
1. configuration.yml�����ݿ���������Ҫ�ĳɱ��ص�;
2. ���ݿ����Ƹĳ�mada�����߰Ѵ����еģ�����
```
@SqlQuery("select * from mada.cb_objects where id = :id")
```
mada�滻Ϊ�������ݿ�����;
3. ����Ŀ��Ŀ¼������mvn package;
4. ����Ŀ��Ŀ¼�����С� `java -jar target/mada-0.0.1-SNAPSHOT.jar server configuration.yml`;
5. ����`127.0.0.1:8080/query/{graphqlQueryString}`��ѯ��


### 2. ����
1. ���ܣ���ѯ����ͨ��x�����ʵĹ�˾���Լ����Ա��Ϣ����Ա��ѧλ��Ϣ��
	* �����ֶβ�ѯ��
```    
{
    //��ѯ�����������ϵģ�Ҳ���ǹ���B�ֵġ�����company(id:"c1")��ѯidΪc:1�ġ� )
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
        //��Ա��ϵ
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
            //��Ա�ľ�����Ϣ
            peopleInfo{
                id,
                objectId,
                firstName,
                lastName,
                birthplace,
                affiliationName,
                //ѧλ��Ϣ
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

