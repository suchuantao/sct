package heima.man;

import java.util.Scanner;

/*
 * 键盘录入三个数，比较输出最大值
 * */
public class MethTest3 {
    public static int getMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }

        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a=scanner.nextInt();
        System.out.println("请输入第二个是数");
        int b=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int c=scanner.nextInt();
        int d=getMax(a,b,c);
        System.out.println("最大值为："+d);
    }
}

