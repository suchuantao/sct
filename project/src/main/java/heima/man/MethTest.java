package heima.man;

import java.util.Scanner;
/*
* 键盘键入两个数，求最大值
* */
public class MethTest {
    public static void main(String[] args) {
        //键盘输入数据
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a=scanner.nextInt();
        System.out.println("请输入第99二个数：");
        int b=scanner.nextInt();
        //方法调用
        int max =getMax(a,b);
        System.out.println("两个数的最大值为："+max);

    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
}
