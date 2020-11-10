package heima.scanner;

import java.util.Scanner;

/*
* 键盘输入数据
* */
public class ScannerTest {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据：");
        int i=sc.nextInt();
        System.out.println("输入的数据为："+i);

        //从键盘输入两个数据并求和
        System.out.println("请输入第一个数据：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("输入两数之和："+sum);
    }



}
