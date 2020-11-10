package yunnex.member;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.junit.Assert;
import yunnex.junit.DateTime;
import yunnex.junit.RandomNumber;
import yunnex.shop.ShopInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/26 16:49
 */

/**
 * 查询会员信息
 */
public class FindMember {
    /**
     * 查询商户下所有会员信息
     * 100条会员信息
     */
    public void findMemberList() {
        // String cookie = response.getCookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID");
        String param = "{\"pageInfo\":{\"currentPage\":1,\"pageSize\":100},\"activeTag\":[],\"balanceBegin\":\"\",\"balanceEnd\":\"\",\"bonusBegin\":null,\"bonusEnd\":null,\"originChannels\":[],\"firstConsumeStore\":[],\"firstRechargeStore\":[],\"loyalTag\":[],\"fuzzyQueryStr\":\"\",\"fuzzyName\":\"\",\"memberMark\":[],\"memberName\":\"\",\"phoneNumber\":\"\",\"registerStore\":[],\"sumAmountRechargeBegin\":\"\",\"sumAmountRechargeEnd\":\"\",\"sumBonusRechargeBegin\":\"\",\"sumBonusRechargeEnd\":\"\",\"valueTag\":[],\"levelId\":\"\"}";
        Response response = given()
                .log().all()
                .config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
                .contentType("application/json")
                .when()
                .request().body(param)
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/newlist");
        response.getBody().jsonPath().prettyPrint();//格式化参数
        Assert.assertTrue("登录失败", true);//断言


    }

    /**
     * 根据手机号查询会员信息
     *
     * @return availableBonus   剩余积分
     */
    public Map<String,Integer> findPhoneNumberMemberInfo() {
        Map<String,Integer> map=new HashMap<String, Integer>();
        // String cookie = response.getCookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID");
        String param = "{\"pageInfo\":{\"currentPage\":1,\"pageSize\":10},\"activeTag\":[],\"balanceBegin\":\"\",\"balanceEnd\":\"\",\"bonusBegin\":null,\"bonusEnd\":null,\"originChannels\":[],\"firstConsumeStore\":[],\"firstRechargeStore\":[],\"loyalTag\":[],\"fuzzyQueryStr\":\"\",\"fuzzyName\":\"\",\"memberMark\":[],\"memberName\":\"\",\"phoneNumber\":\"15271955786\",\"registerStore\":[],\"sumAmountRechargeBegin\":\"\",\"sumAmountRechargeEnd\":\"\",\"sumBonusRechargeBegin\":\"\",\"sumBonusRechargeEnd\":\"\",\"valueTag\":[],\"levelId\":\"\"}";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))//https请求
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
                .contentType("application/json").
                        when()
                .body(param)
                .post(" https://s.hotfix.zb25.com.cn/user-web-admin/customer/newlist");
        response.getBody().jsonPath().prettyPrint();
        Boolean success=  response.getBody().jsonPath().get("success");
        Assert.assertEquals(success,true);//断言

        //获取剩余积分
        List<Integer> bonus  = response.getBody().jsonPath().getList("entry.aaData.bonus");
        for (int i = 0; i <bonus.size() ; i++) {
            map.put("bonus",bonus.get(0));

        }
        System.out.println("获取剩余积分："+bonus);
        //获取可用积分
        List<Integer> availableBonus = response.getBody().jsonPath().getList("entry.aaData.availableBonus");
        for (int i = 0; i <availableBonus.size(); i++) {
            map.put("availableBonus",availableBonus.get(0));

        }

        System.out.println("获取可用积分：" + availableBonus);


        return map;
    }

    /**
     * 商户后台手动增加积分
     */
    public void shopIncreaseIntegral(Map<String,Integer> map){
        String integral="{\"id\":118575,\"bonus\":"+map.get("bonus")+",\"availableBonus\":"+map.get("availableBonus")+",\"bonusChange\":"+RandomNumber.randomIntegral()+",\"changeType\":1,\"superPass\":\"123456\",\"setValidTime\":false}";
        Response response=given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/json")
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID",ShopInfo.COOKIE)
                .request().body(integral)
                .when()
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/bonus/modify");
        response.getBody().jsonPath().prettyPrint();
        String massage=  response.getBody().jsonPath().get("message");
        Assert.assertEquals(massage,"会员积分修改成功");//断言
    }

    /**
     * 商户后台手动扣减积分
     */
    public void shopDeductionntegral(Map<String,Integer> map){

        String integral="{\"id\":118575,\"bonus\":"+map.get("bonus")+",\"availableBonus\":"+map.get("availableBonus")+",\"bonusChange\":"+RandomNumber.randomIntegral()+",\"changeType\":2,\"superPass\":\"123456\",\"setValidTime\":false}";
        Response response=given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/json")
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID",ShopInfo.COOKIE)
                .request().body(integral)
                .when()
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/bonus/modify");
        response.getBody().jsonPath().prettyPrint();
       String massage= response.getBody().jsonPath().get("message");
       Assert.assertEquals(massage,"会员积分修改成功");
    }

    /**
     * 查询近30天会员余额变动记录
     */
    public void FindBalanceRecords() {

        String param3 = "{\n" +
                "    \"fmDate\": \"" + DateTime.todayThirtyDay() + "\",\n" +
                "    \"toDate\": \"" + DateTime.setToday() + "\",\n" +
                "    \"operatorName\": \"\",\n" +
                "    \"accountName\": \"\",\n" +
                "    \"type\": \"\",\n" +
                "    \"shopBranchId\": \"\",\n" +
                "    \"pageInfo\": {\n" +
                "        \"currentPage\": 1,\n" +
                "        \"pageSize\": 10\n" +
                "    },\n" +
                "    \"memberId\": 118575\n" +
                "}";
        Response response=given()
                .log().all()
                .config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
                .contentType("application/json;charset=UTF-8")
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID",ShopInfo.COOKIE)
                .request().body(param3)
                .when()
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/balance/records");
        response.getBody().jsonPath().prettyPrint();
        Boolean success= response.getBody().jsonPath().get("success");
        Assert.assertEquals(success,true);//断言
    }

    /**
     * 根据手机号查询会员详情信息
     */
    public void findMemberInfo() {
        //  根据手机号查询会员详情页
     Response response=   given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/json")
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
                .when()
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/detail/118575 ");
        response.getBody().jsonPath().prettyPrint();
    boolean success= response.getBody().jsonPath().get("success");
    Assert.assertEquals(success,true);



    }

    /**
     * 查询近30天会员积分变动记录
     */

    public void findMemberBonusRecords() {
        String memberbonusrecords = "{\"fmDate\":\"" + DateTime.todayThirtyDay() + "\",\"toDate\":\"" + DateTime.setToday() + "\",\"operatorName\":\"\",\"type\":\"\",\"shopBranchId\":\"\",\"pageInfo\":{\"currentPage\":1,\"pageSize\":10},\"memberId\":118575}";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/json")
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
                .request().body(memberbonusrecords)
                .when()
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/bonus/records ");

        response.getBody().jsonPath().prettyPrint();
        boolean success= response.getBody().jsonPath().get("success");
        Assert.assertEquals(success,true);//断言


    }
}
