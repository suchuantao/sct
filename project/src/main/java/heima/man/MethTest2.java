package heima.man;

import java.util.Scanner;

/*
* 键盘录入两个数，判断是否相等
* */
public class MethTest2 {
    public static boolean compare(int a,int b){
        if(a==b){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        //键盘录入两个数
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b=scanner.nextInt();
        boolean c=compare(a,b);
        System.out.println(c);
    }
}
