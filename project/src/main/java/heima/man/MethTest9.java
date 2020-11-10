package heima.man;
/*
* 如果参数类型是引用数据类型，形参值的改变影响实参的值
*   引用数据类型有：类，接口，数组
* */
public class MethTest9 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        chengji(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void chengji(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr[i]*=2;
            }
        }


    }
}
