package yunnex.member;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/29 10:28
 */

import io.restassured.response.Response;
import org.junit.Assert;
import yunnex.junit.RandomNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 会员消费与充值
 */
public class MemberConsumption {

    //设置POS机请求头常量
    public static Map<String, String> POS_LOGIN_REQUES_THEADER;


    /**
     * pos机登录
     * 返回token
     *
     * @return
     */
    public String posLogin() {
        String posLoginParameter = "{\"id\":\"138\",\"password\":\"e10adc3949ba59abbe56e057f20f883e\"}";

        POS_LOGIN_REQUES_THEADER = new HashMap<String, String>();
        //  POS_LOGIN_REQUES_THEADER.put("Cookie", "stoken=BbFQx6KZVZyvXmut6+IcW3Y+U0aye9xvxF/BQN1I84Q=");//不是必要的请求头
        POS_LOGIN_REQUES_THEADER.put("DeviceId", "862602018027276");
        POS_LOGIN_REQUES_THEADER.put("ProtocolVersion", "4.2");
        POS_LOGIN_REQUES_THEADER.put("SerialNo", "0123456789ABCDEF");
        POS_LOGIN_REQUES_THEADER.put("OperatorId", "138");
        POS_LOGIN_REQUES_THEADER.put("ProductVersion", "5.9.1Z500H1");
        POS_LOGIN_REQUES_THEADER.put("Accept-Encoding", "gzip,deflate");
        POS_LOGIN_REQUES_THEADER.put("Content-Type", "application/json; charset=utf-8");
        POS_LOGIN_REQUES_THEADER.put("Connection", "Keep-Alive");
        POS_LOGIN_REQUES_THEADER.put("User-Agent", "okhttp/2.5.0");

        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(posLoginParameter)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/shop-api-pos/password/login");
        response.getBody().jsonPath().prettyPrint();//格式化参数
        boolean success = response.getBody().jsonPath().get("success");

        Assert.assertEquals(success, true);
        //获取返回值token
        String TOKEN = response.getBody().jsonPath().get("token");

        //返回token
        return TOKEN;


    }

    /**
     * 查询pos机端会员主页
     */
    public void findPosMemberInfo(String token) {
        String phoneNumber = "{\"code\":\"15271955786\"}";
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(phoneNumber)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/user-api-pos/customer/customer_query_v3");
        response.getBody().jsonPath().prettyPrint();//格式化参数
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言

    }

    /**
     * pos机手动增加会员积分
     *
     * @param token
     */
    public void posMemberIncreaseIntegral(String token) {
        String increaseIntergralparameter = "{\"bonus\":" + RandomNumber.randomIntegral() + ",\"code\":\"15271955786\",\"timeStamp\":1603957912250,\"updateType\":1}";
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(increaseIntergralparameter)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/user-api-pos/customer/customer_bonus_update_v37");
        response.getBody().jsonPath().prettyPrint();//格式化参数
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言

    }

    /**
     * pos机手动扣扣减员积分
     *
     * @param token
     */
    public void posMemberDeductionIntegral(String token) {
        String increaseIntergralparameter = "{\"bonus\":" + RandomNumber.randomIntegral() + ",\"code\":\"15271955786\",\"timeStamp\":1603957912250,\"updateType\":2}";
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(increaseIntergralparameter)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/user-api-pos/customer/customer_bonus_update_v37");
        response.getBody().jsonPath().prettyPrint();//格式化参数
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言

    }


    /**
     * 会员pos机充值,第一步获取订单号,返回订单号
     */
    public String getMemberPosRechargeOrder(String token) {
        String amountCod = "{\"amount\":\"" + RandomNumber.randomMoney() + "\",\"code\":\"15271955786\"}";
        //把得到的map请求头再加入token
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(amountCod)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/user-api-pos/customer/recharge/order");
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言
        String order = response.getBody().jsonPath().get("attach.orderId");//获取订单id
        return order;

    }

    /**
     * 会员pos机充值，第二步确认充值
     */
    public void confirmCash(String token, String order) {
        String orderId = "{\"orderId\":\"" + order + "\",\"versions\":\"5.9\"}";
        //把得到的map请求头再加入token
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(orderId)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/payment-api-pos/confirm_cash ");
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言
    }

    /**
     * pos机储值账户消费-pos机会员储值账户验证手机号
     * 第一步，发起支付
     * 返回订单号
     */
    public String posMemberStoredValueInitiatePayment(String token) {
        String initiatePaymen = "{\"amount\":" + RandomNumber.randomMoney() + ",\"cardNum\":0,\"cashAccount\":0,\"customerId\":0,\"discount\":0.0,\"latestPayTime\":0,\"orderType\":2,\"undiscountableAmount\":0}";
        //把得到的map请求头再加入token
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(initiatePaymen)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/payment-api-pos/porder_gen");
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言
        //获取返回值orderId
        String orderId = response.getBody().jsonPath().get("orderId");
        //返回orderId
        return orderId;

    }

    /**
     * pos机储值账户消费-pos机会员储值账户验证手机号
     * 第二步，确认支付，验证手机号，储值账户密码
     */
    public void posMemberStoredValueConfirmPayment(String token, String orderId) {
        String confirmPaymentParter = "{\"memberVerifyType\":2,\"mobile\":\"15271955786\",\"orderId\":\"" + orderId + "\",\"password\":\"e10adc3949ba59abbe56e057f20f883e\",\"payTriggerType\":2}";
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(confirmPaymentParter)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/payment-api-pos/card_pay");
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言

    }

    /**
     * 查询POS端卡券列表，返回自动化测试领券勿动该张券
     *
     * @return
     */
    public Map<String, String> posConsumList(String token) {
        Map<String, String> map = new HashMap<String, String>();
        String posConsumListparter = "{\"applicationProtocolInterfaceVersioncode\":370,\"page\":3,\"pageSize\":10}";
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(posConsumListparter)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/promotion-api-pos/card/list");
        response.getBody().jsonPath().prettyPrint();
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言
        List<String> consumList = response.getBody().jsonPath().getList("cardList.serial");
        for (int i = 0; i < consumList.size(); i++) {
            map.put("serial", consumList.get(0));
        }
        System.out.println("serial" + map);
        return map;
    }

    /**
     * pos端领取优惠券
     */
    public void posCollectCoupons(Map<String,String> map,String token){
       String posCollectCouponsParter="{\"number\":1,\"serial\":\""+map.get("serial")+"\"}";
       POS_LOGIN_REQUES_THEADER.put("token",token);
       Response response=given()
               .log().all()
               .headers(POS_LOGIN_REQUES_THEADER)
               .request().body(posCollectCouponsParter)
               .when()
               .post("http://saofu.client.hotfix.zb25.com.cn/promotion-api-pos/coupon/detail");
       response.getBody().jsonPath().prettyPrint();
       boolean success= response.getBody().jsonPath().get("success");
       Assert.assertEquals(success,true);
    }


    /**
     * pos机储值账户消费-微信扫一扫支付二维码
     * 第一步，发起支付
     * 返回订单号
     */
    public String posCZHIInitiatePayment(String token) {
        String initiatePaymen = "{\"amount\":" + RandomNumber.randomMoney() + ",\"cardNum\":0,\"cashAccount\":0,\"customerId\":0,\"discount\":0.0,\"latestPayTime\":0,\"orderType\":2,\"undiscountableAmount\":0}";
        //把得到的map请求头再加入token
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response = given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(initiatePaymen)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/payment-api-pos/porder_gen");
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);//断言
        //获取返回值orderId
        String orderId = response.getBody().jsonPath().get("orderId");
        //返回orderId
        return orderId;
    }

    /**
     * 微信端领券后pos机扫一扫核销优惠券
     */
    public void poscardCardcouponVerify(String code,String token){
        String CodeParameter="{\"code\":\""+code+"\",\"verify\":1}";
        //把得到的map请求头再加入token
        POS_LOGIN_REQUES_THEADER.put("token", token);
        Response response=given()
                .log().all()
                .headers(POS_LOGIN_REQUES_THEADER)
                .request().body(CodeParameter)
                .when()
                .post("http://saofu.client.hotfix.zb25.com.cn/promotion-api-pos/card/cardcoupon_verify_v3");
        response.getBody().jsonPath().prettyPrint();
        boolean success= response.getBody().jsonPath().get("success");
        Assert.assertEquals(success,true);//断言

    }
}

