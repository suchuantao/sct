package heima.string;

import java.util.Scanner;

/*
 * 输入一个字符串，判断中的大小写个数以及数字的个数
 *
 * */
public class StringTest6 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String string = scanner.nextLine();
        //定义变量，统计大，小写以及数字的个数
        int d = 0;//大写统计
        int x = 0;//小写统计
        int n = 0;//数字统计
        //遍历字符串
        for (int i = 0; i < string.length(); i++) {
            //使用charAt()获取指定字符串的索引
            char ch = string.charAt(i);
            //判断大写
            if (ch >= 'A' && ch <= 'Z') {
                d++;
                //判断小写
            } else if (ch >= 'a' && ch <= 'z') {
                x++;
            //判断字母
            } else if (ch >= '0' && ch <= '9') {
                n++;
            } else {
                System.out.println("你输入的" + ch + "不合法");
            }
        }
        System.out.println("大写个数为：" + d);
        System.out.println("小写个数为：" + x);
        System.out.println("数字个数为：" + n);
    }
}
