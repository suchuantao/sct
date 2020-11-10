package heima.javaarray.random;

import java.util.Random;
import java.util.Scanner;

/*
 * 创建一个1~100之间的猜数游戏
 *
 *
 * */
public class RandomTest {
    public static void main(String[] args) {
        //创建一个随机数
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        //使用while循环
        while (true) {
            //键盘录入一个数
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入1~100之间的随机数");//接收数据
            int greeNumber = scanner.nextInt();
            if (greeNumber > number) {
                System.out.println("你猜的数" + greeNumber + "大了");
            } else if (greeNumber < number) {
                System.out.println("你猜的数" + greeNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
    }
}
