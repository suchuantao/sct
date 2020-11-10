package demo;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static io.restassured.RestAssured.given;

public class App {

    @Test
    public void testRest() {
        //登录url
        String login_url = "http://s.hotfix.zb25.com.cn/saofu-shop-shop/login";
        String jsonStr = "{\"username\":\"szyunnex\",\"password\":\"123456\"}";
        Response response = given()

                .log()
                .all()
                .contentType("application/json")
                .body(jsonStr)
                .when()
                .post(login_url);
        String cookie = response.getCookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID");
        System.out.println("response.asString() = " + response.asString());
        response.getBody().prettyPrint();//格式化打印JSON数据

//根据手机号查询会员信息


      //  根据手机号查询会员详情页
                given()
                        .log().all()
                        .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                        .contentType("application/json")
                        .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID", cookie)
                .when()
                        .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/detail/118575 ")
                .then()
                         .log().all()
                         .assertThat().statusCode(200);

                //查询会员余额变动记录
        //获取当前日期
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String endtime =sdf.format(today);

        //获取三十天前日期
        Calendar theCa = Calendar.getInstance();
        theCa.setTime(today);
        theCa.add(theCa.DATE, -30);//最后一个数字30可改，30天的意思
        Date start = theCa.getTime();
        String startDate = sdf.format(start);//三十天之前日期

        String param3 ="{\"fmDate\":\""+startDate+"\",\"toDate\":\""+endtime+"\",\"operatorName\":\"\",\"accountName\":\"\",\"type\":\"\",\"shopBranchId\":\"\",\"pageInfo\":{\"currentPage\":1,\"pageSize\":10},\"memberId\":118575}";
                given()
                      .log().all()
                      .config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                      .contentType("application/json")
                      .cookie(".HOTFIX.ZB25.COM.CN_SHAREJSESSIONID",cookie)
                .when()
                       .body(param3)
                       .post("https://s.hotfix.zb25.com.cn/user-web-admin/customer/member/balance/records")
                .then()
                        .log().all()
                        .assertThat().statusCode(200);









    }



}
