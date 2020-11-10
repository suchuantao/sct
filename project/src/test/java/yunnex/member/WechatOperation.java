package yunnex.member;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/11/2 13:42
 */

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import yunnex.junit.HttpsHeader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


/**
 * 微信端操作
 */
public class WechatOperation {
    /**
     * 查询微信端会员主页
     */
    public void wectchMemberHomepage() {

        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .when()
                .get("https://m.hotfix.zb25.com.cn/master-card/10755677539392954368?wechat_https=1");
        response.getBody().prettyPrint();
    }

    /**
     * 查询微信端会员主页余额变动记录
     */
    public void wectchAccountBalanceRecord() {
        String wectchAccountBalanceRecordParter = "currentPage=1&lastTime=0";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .request().body(wectchAccountBalanceRecordParter)
                .when()
                .post("https://m.hotfix.zb25.com.cn/account/balance/record/10755677539392954368");
        response.getBody().jsonPath().prettyPrint();
    }

    /**
     * 查询微信端会员积分变动记录
     */
    public void findWectchIntegralRecord() {
        String wectchAccountIntegraRecordParter = "currentPage=1&lastTime=0";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .request().body(wectchAccountIntegraRecordParter)
                .when()
                .post("https://m.hotfix.zb25.com.cn/account/bonus/record/10755677539392954368");
        response.getBody().jsonPath().prettyPrint();

    }

    /**
     * 查看微信端卡券中心
     */
    public void findWectchCardVoucherCenter() {
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .when()
                .get("https://m.hotfix.zb25.com.cn/kqlist/10755677539392954368?wechat_card_js=1&wechat_https=1");
        response.getBody().htmlPath().prettyPrint();
    }

    /**
     * 微信端卡券领取优惠券
     */
    public String WectchCardVoucherCenterReceive() {
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .when()
                .post("https://m.hotfix.zb25.com.cn/kq/getincoupon/401072415460089270272/o7PBbxFBonVhhDjI57StGMOxRoEs");
        response.getBody().jsonPath().prettyPrint();
        boolean success = response.getBody().jsonPath().get("success");
        String code = response.getBody().jsonPath().get("cardCode");//获取卡券code
        Assert.assertEquals(success, true);//断言
        return code;//返回卡券code
    }

    /**
     * 会员主页-积分商城
     */
    public void activityList() {
        String activityListparter = "page_no=1&serial=10755677539392954368";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/x-www-form-urlencoded")
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .request().body(activityListparter)
                .when()
                .post("https://m.hotfix.zb25.com.cn/kq/member/mall/activity/list");
        response.getBody().jsonPath().prettyPrint();

    }

    /**
     * 积分兑换
     */
    public String activityExchange() {
        //活动activityId考虑写死，因为，如果在新创积分兑换活动，获取到的活动id就会变化
        String activityExchangeparter = "activityId=114&serial=10755677539392954368&openId=o7PBbxFBonVhhDjI57StGMOxRoEs";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/x-www-form-urlencoded")
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .request().body(activityExchangeparter)
                .when()
                .post("https://m.hotfix.zb25.com.cn/kq/member/mall/activity/exchange");
        response.getBody().jsonPath().prettyPrint();
        String attach = response.getBody().jsonPath().get("attach");//获取到兑换成功的券码
        boolean success = response.getBody().jsonPath().get("success");
        Assert.assertEquals(success, true);
        return attach;//返回券码,返回一张礼品券
    }

    /**
     * 智慧餐厅-创建购物车
     */
    public void zhct_shopping_cart() {
        String parter1 = "{\"amount\":1,\"goodsId\":45340,\"attrs\":[],\"tastes\":[],\"addItems\":[],\"recommendGoodList\":[],\"source\":0,\"packingBoxs\":[],\"tableId\":47488}";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.zhctwectchHeader())
                .contentType("application/json;charset=UTF-8")
                .request().body(parter1)
                .when()
                .post("https://m.hotfix.zb25.com.cn/canyin-web-mobile/wxcanyin/shopping_cart/create?shopSerial=10755677539392954368&branchId=1516662967&teamMode=0");
        response.getBody().jsonPath().prettyPrint();
        String message= response.getBody().jsonPath().get("message");
        Assert.assertEquals(message,"success");


    }

    /**
     * 查询购物车
     */
    public void query_shopping_card() {
        String parter10 = "{\"source\":0,\"tableId\":47488}";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.wectchHeader())
                .contentType("application/json;charset=UTF-8")
                .request().body(parter10)
                .when()
                .post("https://m.hotfix.zb25.com.cn/canyin-web-mobile/wxcanyin/shopping_cart/query_list?shopSerial=10755677539392954368&branchId=1516662967&teamMode=0");
        response.getBody().prettyPrint();
        String message= response.getBody().jsonPath().get("message");
        Assert.assertEquals(message,"success");

    }


    /**
     * 智慧餐厅~获取最佳优惠
     * 返回couponId
     * 返回codeList
     */
    public Map<String, Long> smart_shop_bestBenefit() {
        Map<String, Long> map = new HashMap<String, Long>();

        String parter4 = "{\"shopId\":1,\"branchId\":1516662967,\"customerId\":243985,\"campaignScope\":1,\"items\":[{\"buyCount\":1,\"categoryId\":204,\"goodsItemName\":\"好吃的面\",\"id\":45298,\"goodsEnableDiscount\":0,\"originalPrice\":5000,\"skuId\":10507},{\"buyCount\":1,\"categoryId\":252,\"goodsItemName\":\"季节菜苔\",\"id\":45340,\"goodsEnableDiscount\":0,\"originalPrice\":700,\"skuId\":10594}],\"callChannel\":1,\"couponUseScope\":3,\"tradeFee\":5700,\"undiscountableAmount\":0,\"orderSn\":\"\",\"openId\":\"o7PBbxFBonVhhDjI57StGMOxRoEs\",\"usedBenefits\":[]}";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.zhctwectchHeader())
                .contentType("application/json;charset=UTF-8")
                .request().body(parter4)
                .when()
                .post("https://m.hotfix.zb25.com.cn/canyin-web-mobile/smart_shop/bestBenefit?shopSerial=10755677539392954368&branchId=1516662967");
        response.getBody().jsonPath().prettyPrint();
       int code= response.getBody().jsonPath().get("code");
       Assert.assertEquals(code,0);

        //获取couponId
        List<Long> couponIds = response.getBody().jsonPath().getList("response.market.usableBenefits.couponId");
        for (int i = 0; i < couponIds.size(); i++) {
            map.put("couponId", couponIds.get(0));
        }
        //获取到codeList
        List<Long> codeLists = response.getBody().jsonPath().getList("response.market.usableBenefits.codeList");
        //获取到的集合数据去掉中括号[]
        String[] codelistStr = StringUtils.split(codeLists.toString(), "[]");

        //把String[]转换成Long类型，并添加到map，并只取第一个值
        map.put("codeList", Long.parseLong(codelistStr[0]));
        return map;
    }


    /**
     * 智慧餐厅-选好了使用优惠礼品券
     * 返回17单号
     */
    public String get_order17(Map<String, Long> map) {

        String parter5 = "{\"goods\":[{\"addItems\":[],\"amount\":1,\"attrs\":[],\"branchId\":1516662967,\"categoryId\":204,\"channel\":0,\"checkAttrs\":[],\"customerHeadImgUrl\":\"http://thirdwx.qlogo.cn/mmopen/WlibZlS5nyMGqsJ3nA1Dj9GAozP8Rribd5LTY5cqATbVJsXwoN2lFmHqNbzPsn4ZBlADxGcxHwyKHpIEsJVpUJPUXb3on5Ceqw/132\",\"customerId\":243985,\"enableWeighing\":0,\"fissionAttrs\":\"\",\"goodsEnableDiscount\":0,\"goodsId\":45298,\"goodsName\":\"好吃的面\",\"goodsUnit\":\"份\",\"id\":72254,\"isPackage\":0,\"isSetSecondDiscount\":0,\"openId\":\"o7PBbxFBonVhhDjI57StGMOxRoEs\",\"originalPrice\":5000,\"packageAmount\":0,\"packageDtl\":\"\",\"packageGoods\":[],\"packagePrice\":0,\"packingBoxs\":[],\"pic\":\"\",\"price\":5000,\"priceType\":1,\"productId\":10341,\"recommend\":false,\"recommendGoodList\":[],\"secondDiscountFlag\":0,\"shopId\":1,\"skuId\":10507,\"skuName\":\"\",\"soldStatus\":2,\"source\":0,\"tableId\":47488,\"tastes\":[],\"weight\":0,\"priceSource\":1,\"_hasOtherPrice\":false},{\"addItems\":[],\"amount\":1,\"attrs\":[],\"branchId\":1516662967,\"categoryId\":252,\"channel\":0,\"checkAttrs\":[],\"customerHeadImgUrl\":\"http://thirdwx.qlogo.cn/mmopen/WlibZlS5nyMGqsJ3nA1Dj9GAozP8Rribd5LTY5cqATbVJsXwoN2lFmHqNbzPsn4ZBlADxGcxHwyKHpIEsJVpUJPUXb3on5Ceqw/132\",\"customerId\":243985,\"enableWeighing\":0,\"fissionAttrs\":\"\",\"goodsEnableDiscount\":0,\"goodsId\":45340,\"goodsName\":\"季节菜苔\",\"goodsUnit\":\"份\",\"id\":72255,\"isPackage\":0,\"isSetSecondDiscount\":0,\"openId\":\"o7PBbxFBonVhhDjI57StGMOxRoEs\",\"originalPrice\":700,\"packageAmount\":0,\"packageDtl\":\"\",\"packageGoods\":[],\"packagePrice\":0,\"packingBoxs\":[],\"pic\":\"\",\"price\":700,\"priceType\":1,\"productId\":10428,\"recommend\":false,\"recommendGoodList\":[],\"secondDiscountFlag\":0,\"shopId\":1,\"skuId\":10594,\"skuName\":\"\",\"soldStatus\":2,\"source\":0,\"tableId\":47488,\"tastes\":[],\"weight\":0,\"priceSource\":1,\"_hasOtherPrice\":false}],\"remark\":\"\",\"logisticsOrderId\":\"\",\"deliveryFee\":0,\"source\":0,\"shoppingId\":[72254,72255],\"usableBenefits\":[{\"uniqueId\":\"53_31034\",\"bizId\":null,\"couponId\":" + map.get("couponId") + ",\"benefitWay\":53,\"type\":4,\"overlapStatus\":2,\"bizName\":\"好吃的面-勿动\",\"name\":\"好吃的面-勿动\",\"content\":\"可0.01元购买:好吃的面1份\\n2020.11.03-2029.12.31有效\",\"discountText\":\"49.99\",\"bottomText\":\"礼品券*1\",\"givingPrefix\":null,\"beginTime\":1604332800000,\"endTime\":1893340800000,\"reduction\":4999,\"memberDiscount\":null,\"givingGoods\":null,\"specialGoods\":[{\"goodsItemName\":\"好吃的面\",\"categoryId\":204,\"spuId\":null,\"skuId\":10507,\"discount\":null,\"deduct\":4999,\"soldPrice\":null,\"originalPrice\":5000,\"count\":1,\"valuationCount\":1}],\"fitGoods\":null,\"codeList\":[\"" + map.get("codeList") + "\"],\"couponInfo\":{\"type\":4,\"benefitWay\":53,\"title\":\"好吃的面-勿动\",\"id\":31034,\"couponType\":\"gift\",\"customerId\":243985,\"cardId\":\"p7PBbxPCX4FE0sW8hQLKzXiRvnlM\",\"serial\":\"401323458364755283968\",\"cashLeastCost\":0,\"cashReduceCost\":0,\"discount\":null,\"gift\":\"好吃的面\",\"subTitle\":null,\"content\":null,\"dateInfoType\":1,\"dateInfoBeginTimestamp\":1604332800000,\"dateInfoEndTimestamp\":1893340800000,\"dateInfoFixedTerm\":null,\"fixedBeginTerm\":null,\"batchVerifyLimit\":1,\"maxCodeList\":[\"" + map.get("codeList") + "\"],\"codeList\":[\"" + map.get("codeList") + "\"],\"externalCode\":\"\",\"couponGift\":null,\"useScopeTypes\":\"0,3\",\"goodsFlags\":\"3#2\",\"goodsFlag\":2,\"canyinUseScope\":3,\"goodsList\":[{\"id\":399,\"couponWeixinId\":" + map.get("couponId") + ",\"useScopeType\":3,\"skuId\":10507,\"goodsName\":\"好吃的面\",\"categoryId\":204,\"categoryName\":\"匠心拉面\"}]},\"unusableReason\":null,\"customBenefitPrice\":null,\"ruleIds\":null,\"memberPriceDto\":null,\"orderReduction\":null,\"benefitItems\":[{\"itemId\":\"" + map.get("codeList") + "\",\"itemName\":\"礼品券：好吃的面\",\"benefitPrice\":4999,\"skuId\":null}],\"chosenBenefit\":true,\"specialCampaign\":false,\"deductCampaign\":false,\"discountMemberCampaign\":false,\"priceMemberCampaign\":false,\"codeBenefit\":true,\"customBenefit\":false,\"randomDeductionCampaign\":false,\"nonPresuppositionCustomBenefit\":false,\"deductCustomBenefit\":false,\"specialCustomBenefit\":false,\"campaignBenefit\":false,\"lockBizId\":\"53\",\"givingCampaign\":false}],\"type\":3,\"fast\":{\"people\":13,\"remark\":\"\",\"dineType\":1},\"customerPhone\":\"15271955786\"}";

        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.zhctwectchHeader())
                .contentType("application/json;charset=UTF-8")
                .request().body(parter5)
                .when()
                .post("https://m.hotfix.zb25.com.cn/canyin-web-mobile/wxcanyin/orders/order_creater?shopSerial=10755677539392954368&branchId=1516662967&teamMode=0");
        String orderId17 = response.getBody().jsonPath().get("response.orderId");//获取17单号
        response.getBody().jsonPath().prettyPrint();
        String message= response.getBody().jsonPath().get("message");
        Assert.assertEquals(message,"success");
        return orderId17;//返回17单号


    }

    /**
     * 智慧餐厅~发起支付
     * 返回 支付url "url":"https://m.hotfix.zb25.com.cn/pay/new_pay?
     * 返回20单号
     */

    public String get20danhao(String orderId17) {
        String parter6 = "{\"orderId\":\"" + orderId17 + "\",\"payType\":\"\",\"userFee\":\"\",\"source\":0}";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.zhctwectchHeader())
                .contentType("application/json;charset=UTF-8")
                .request().body(parter6)
                .when()
                .post("https://m.hotfix.zb25.com.cn/canyin-web-mobile/wxcanyin/order/post?shopSerial=10755677539392954368&branchId=1516662967&teamMode=0");
        String orderId20 = response.getBody().jsonPath().get("response.zbOrderId");//获取17单号
        response.getBody().jsonPath().prettyPrint();
        String message= response.getBody().jsonPath().get("message");
        Assert.assertEquals(message,"success");
        return orderId20;//返回20单号
    }

    /**
     * 智慧餐厅使用储值卡支付
     */
    public void zhct_czkzf(String orderId20) {
        String parter7 = "shopId=1&shopSerial=10755677539392954368&shopBranchId=1516662967&appId=wx21e8553ca7b6b34a&tradeFee=701&unDiscountFee=0&orderId=" + orderId20 + "&openId=o7PBbxFBonVhhDjI57StGMOxRoEs";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.zhctwectchHeader())
                .contentType("application/x-www-form-urlencoded")
                .request().body(parter7)
                .when()
                .post("https://m.hotfix.zb25.com.cn/pay_v2/get_user_cards");
        response.getBody().jsonPath().prettyPrint();
        boolean success= response.getBody().jsonPath().get("success");
        Assert.assertEquals(success,true);
    }

    /**
     * 智慧餐厅确认支付
     */
    public void zhcychzhPayconfirm(Map<String, Long> map, String orderId20) {
        String parter8 = "customerId=243985&openId=o7PBbxFBonVhhDjI57StGMOxRoEs&productOrderId=" + orderId20 + "&yhCardType=coupon&yhCodeList=" + map.get("codeList") + "&yhDiscountFee=4999&yhBonusDiscountNum=0&yhBonusDiscountFee=0&blocked=1&shopId=1&cardSerial=&cardType=1";
        Response response = given()
                .log().all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(HttpsHeader.wectchcookie())
                .headers(HttpsHeader.zhctwectchHeader())
                .contentType("application/x-www-form-urlencoded")
                .request().body(parter8)
                .when()
                .post("https://m.hotfix.zb25.com.cn/pay_v2/card/pay_confirm");
        response.getBody().jsonPath().prettyPrint();
        boolean success= response.getBody().jsonPath().get("success");
        Assert.assertEquals(success,true);
    }

}



