package heima.jinjie.array.object.interface0.interfce01.interface02;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/10/9 17:08
 */

/**
 * 篮球教练
 */
public class BasketBallCoach extends Coach implements SpeackEnglish{
    public void teach() {
        System.out.println("教扣篮");
    }

    public void speack() {
        System.out.println("说英语");
    }
}
