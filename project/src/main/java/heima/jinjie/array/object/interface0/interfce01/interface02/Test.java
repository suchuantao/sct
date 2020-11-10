package heima.jinjie.array.object.interface0.interfce01.interface02;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/10/9 16:34
 */

/**
 * 篮球运动员和教练
 * 乒乓球运动员和教练
 * 篮球运动员和教练需要出国访问，学英语
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建篮球运动员
        BasketBallPlayer basketBallPlayer=new BasketBallPlayer();
        basketBallPlayer.name="张三";
        basketBallPlayer.age=22;
        basketBallPlayer.gender="男";
        basketBallPlayer.speack();
        basketBallPlayer.study();
        basketBallPlayer.sleep();

        System.out.println("---------------");
        //创建乒乓球教练
        PingPangCoash pingPangCoash=new PingPangCoash();
        pingPangCoash.name="李四";
        pingPangCoash.age=18;
        pingPangCoash.gender="女";
        pingPangCoash.teach();
        pingPangCoash.eat();
        pingPangCoash.sleep();
    }
}
