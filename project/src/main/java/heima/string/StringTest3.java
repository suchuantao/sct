package heima.string;

import java.util.Scanner;

/*
 * 模拟登录
 * */
public class StringTest3 {
    public static void main(String[] args) {
        //定义用户名和密码
        String username = "admin";
        String pwaaword = "123456";

        int count = 0;
        //判断登录
        for (int i = 0; i < 3; i++) {
            //键盘录入用户名密码
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");
            String pwd = scanner.nextLine();

            if (username.equals(name) && pwaaword.equals(pwd)) {
                System.out.println("登录成功");
                break;
            } else {
                if ((2-i) == 0) {
                    System.out.println("用户名和密码已被锁定，请联系管理员");
                } else {
                    System.out.println("登录失败！你还剩"+(2-i)+"次机会");
                }

            }
        }
    }
}
