package heima.switchtest;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        //根据键盘录入的1，2，3输出对应的星期1，2，3
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入1~7的数字：");
        int weekday=scanner.nextInt();
        switch (weekday){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数据不合法！");
        }
    }
}
