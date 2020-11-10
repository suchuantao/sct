package heima.man;

import java.util.Scanner;

/*
* 查找数组元素
* */
public class ArrayFind {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr={22,33,42,23,34,53,21,22,45,43,53,32,23,20,32};
        //键盘输入元素
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数字中的元素值：");
        int number=scanner.nextInt();
        //调用查找元素的方法，返回索引值
        int index=getArrayIndex(arr,number);
        //打印索引值
        System.out.println("返回该元素的索引为："+index);
    }
//查找元素返回第一次出现的索引
    public static int getArrayIndex(int [] arr,int value){
        //遍历数组，依次比较元素，如果相等，就把此处的索引返回
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                return i;
            }
        }
        //输入的数组元素不存在则返回-1
        return -1;


    }
}
