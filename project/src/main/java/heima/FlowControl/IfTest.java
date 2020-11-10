package heima.FlowControl;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        System.out.println("开始");
        int a=10;
        int b=20;
        if(a==b){
            System.out.println("a等于b");
        }
        if(a!=b){
            System.out.println("a不等于b");
        }
        System.out.println("结束");

        //判断一个数是偶数还是奇数
        int f=101;
        if(f%2==0){
            System.out.println("f是偶数");
        }
        else {
            System.out.println("f是奇数");
        }


        int x=2;
        int y;
        if(x>3){
            y=2*x+1;
        }else if(x>=-1&&x<3){
            y=2*x;
        }else if(x<=-1){
            y=2*x-1;
        }else {
            y=x;
        }
        System.out.println("y="+y);


        //判断学生成绩
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩");
        int score=sc.nextInt();
        if (score>100&&score<0){
            System.out.println("你输入的成绩不合法");
        }else if(score>=90&&score<=100){
            System.out.println("优秀");
        }
        else if(score>=80&&score<90){
            System.out.println("良");
        }
        else if(score>=70&&score<80){
            System.out.println("良-");
        }
        else if(score>=60&&score<70){
            System.out.println("及格");

        }else {
            System.out.println("不及格");
        }
    }
}
