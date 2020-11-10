package heima.man;

import java.util.Scanner;

/*
* 数据加密：
* 键盘录入数据，四位数以上，
* 加密规则：
* 每一个数据+5，然后除以10的余数代替
* 第一位和第四位交换，第二位和第三位交换
* 加密数据输出
*
* */
public class NumberEncryption {
    public static void main(String[] args) {
        //键盘录入
        Scanner scanner=new Scanner(System.in);
        //接收数据
        System.out.println("请输入一个4位数：");
        int number=scanner.nextInt();
        //定义一个数组长度
        int [] arr=new int[4];
        arr[0]=number/1000%10;
        arr[1]=number/100%10;
        arr[2]=number/10%10;
        arr[3]=number%10;
        //每位数字+5，然后/10
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
            arr[i]%=10;

        }
        //第一位和第四位交换：
        int temp=arr[0];//第一位
        arr[0]=arr[3];
        arr[3]=temp;
        //第二位和第三位交换
        int temp2=arr[1];
        arr[1]=arr[2];
        arr[2]=temp2;

        //遍历数组输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

}
