package yunnex.shop;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/26 16:21
 */
public class ShopInfo {

    //设置COOKIE常量
    public static String COOKIE = "";
    /**
     * 商户后台登录
     */
    public static void login() {
        //登录url

        String jsonStr = "{\"username\":\"szyunnex\",\"password\":\"123456\"}";
        Response response = given()
                .log()
                .all()
                .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/json;charset=UTF-8")
                .body(jsonStr)
                .when()
                .post("https://s.hotfix.zb25.com.cn/saofu-shop-shop/login");
        COOKIE = response.getCookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID");
      //  System.out.println("response.asString() = " + response.asString());
        response.getBody().jsonPath().prettyPrint();//格式化打印JSON数据
//        //获取到success
//        Boolean success=   response.getBody().jsonPath().get("success");
//
//
//        try {
//            Assert.assertEquals(success,true);//断言
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("登录失败");
//        }


    }

}
