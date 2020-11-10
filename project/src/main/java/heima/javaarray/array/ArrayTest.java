package heima.javaarray.array;

/*
 * 遍历数组
 * */
public class ArrayTest {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[]{11, 22, 33, 55, 65, 442, 2323, 2392, 23, 286, 20};
        //使用for循环遍历元素
        for (int i = 0; i <= 10; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------");
        //使用数组length属性获取数组的个数
        System.out.println("获取了"+arr.length+"个数组元素");


        System.out.println("使用for循环，数组length属性获取数组长度");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("--------获取数组arr中最大值---------");
        //获取数组arr中最大值
           //定义参照物
        int max =arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("数组中最大值为："+max);


        System.out.println("-----------获取数组arr中最小值-------------");
         //获取arrs数组中最小值
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("获取数组中最小值为："+min);


    }
}
