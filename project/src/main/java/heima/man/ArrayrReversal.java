package heima.man;

/*
* 数组反转
*  1，定义1个数组
*  2，数组反转的原理：第一个索引跟最后一个索引位置交换，第二个跟倒数第二个交换
*       int start=0
*       int end=arr.length-1
*       数据交换：
*       int a=10;
*       int b=20;
*       把a b的值进行互换
*       int temp=a;//定义一个变量
*       a=b;//把b的值赋值给a
*       b=temp;//然后在把temp的值赋值给b,
* */
public class ArrayrReversal {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr= {16,18,23,28,221,27,35,38,39};

        //反转钱调用：
        System.out.println("反转前数组为：");
        printArr(arr);
        //调用数组反转方法：
        ArrayrReversal(arr);
        System.out.println("反转后数组为：");
        //反转后调用
        printArr(arr);

    }
    //数组反转
    public static void ArrayrReversal(int [] arr){
        for (int start=0,end=arr.length-1;start<=end;start++,end--) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

    }
    //数组遍历
    public static void printArr(int [] arr){
        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");
        }

    }
}
