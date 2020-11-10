package yunnex.member;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/27 16:03
 */

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.junit.Assert;
import yunnex.junit.RandomNumber;
import yunnex.shop.ShopInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 修改会员余额和积分
 */
public class ModifyMember {
    /**
     * 获取会员默认账户本金和赠送金额
     * 返回 capitalAmount
     *      presentAmount
     */

    public Map<String, Integer> memberDetail(){

        Map<String,Integer> map=new HashMap<String, Integer>();

        Response response=given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
                .when()
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/detail/118575")
                .then()
                .extract()
                .response();

     //   System.out.println("response.asString() = " + response.asString());
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
       boolean success= response.getBody().jsonPath().get("success");
       Assert.assertEquals(success,true);


        //10.response.getBody().jsonPath().getString("returncode")--获取某一个节点的值（如:return code）
        //获取默认账户储值本金
        List<Integer> capitalAmount1 = response.getBody().jsonPath().getList("attach.bgAccountSnapshots.capitalAmount");
          Integer capitalAmount = null;
        for (int i = 0; i <capitalAmount1.size() ; i++) {
            map.put("capitalAmount",capitalAmount1.get(0));
        }

        //获取默认账户储值赠送金额
       List<Integer> presentAmount1= response.getBody().jsonPath().getList("attach.bgAccountSnapshots.presentAmount");
       Integer presentAmount=null;
        for (int i = 0; i <presentAmount1.size() ; i++) {
            map.put("presentAmount",presentAmount1.get(0));
        }

        return map;
    }


    /**
     * 商户后台手动增加会员余额
     */
    public void increaseMemberBalance(Map<String,Integer> map){

        String increasememberalance="{\"branchGroupId\":0,\"bgAccountId\":0,\"memberId\":\"118575\",\"capitalAmount\":" +map.get("capitalAmount") + ",\"presentAmount\":" +map.get("presentAmount") + ",\"capitalAmountChange\":"+RandomNumber.randomMoney()+",\"presentAmountChange\":"+ RandomNumber.randomMoney() +",\"changeType\":1,\"superPass\":\"123456\",\"setValidTime\":false}";
       Response response=  given()
               .log().all()
               .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
               .contentType("application/json")
               .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
               .request().body(increasememberalance)
               .when()
               .log().all()
               .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/bg_balance/modify");
      //  System.out.println("response.asString() = " + response.asString());
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
      String message=  response.getBody().jsonPath().get("message");
      Assert.assertEquals(message,"会员账户余额修改成功");//断言
    }

    /**
     * 商户后台手动扣减会员余额
     */
    public void increaseMemberBalanceDeduction(Map<String,Integer> map){

        String increasememberalance="{\"branchGroupId\":0,\"bgAccountId\":0,\"memberId\":\"118575\",\"capitalAmount\":" +map.get("capitalAmount") + ",\"presentAmount\":" +map.get("presentAmount") + ",\"capitalAmountChange\":"+RandomNumber.randomMoney()+",\"presentAmountChange\":"+ RandomNumber.randomMoney() +",\"changeType\":2,\"superPass\":\"123456\",\"setValidTime\":false}";
        Response response=  given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/json")
                .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
                .request().body(increasememberalance)
                .when()
                .log().all()
                .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/bg_balance/modify");
        //  System.out.println("response.asString() = " + response.asString());
        String message=  response.getBody().jsonPath().get("message");
        Assert.assertEquals(message,"会员账户余额修改成功");//断言
    }








}
