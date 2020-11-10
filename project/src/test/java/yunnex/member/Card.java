package yunnex.member;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/11/6 15:07
 */

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import yunnex.shop.ShopInfo;

import java.io.File;

import static io.restassured.RestAssured.given;

/**
 * 礼品卡
 */
public class Card {
    /**
     * 创建礼品卡~未上架
     */
    public void creadStoredCard() throws Exception{
        Response response= given()
               .log().all()
               .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))//https请求
               .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", ShopInfo.COOKIE)
               .contentType("multipart/form-data; boundary=----WebKitFormBoundaryPWn0YOnHXxirFBdH")
               .header("user-agent","user-agentMozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36")
               .header("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
               .multiPart(new File("D:\\yunnex-project\\project\\CreadStoredCard.txt"))
               .when()
               .post("https://s.hotfix.zb25.com.cn/promotion-web-admin/kq/kasave?goods=1");

        System.out.println("response.asString() = " + response.asString());

    }
}
