package heima.man;

public class MethTest10 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {11, 33, 44, 67, 42, 9, 25, 39};
        //调用遍历数组的方法
        printArray(arr);
        //调用获取数组最大值方法
        int max = getMax(arr);
        System.out.println("数组中最大值为：" + max);

        //调用获取数组中最小值方法
        int min=getMin(arr);
        System.out.println("数组中最小值方法为："+min);

        //调用数组求和方法
        int sum=SumArray(arr);

    }

    /*
     * 遍历数组的方法
     * */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }


    }

    /*
     * 查找数组中最大值的方法
     * */
    public static int getMax(int[] arry) {
        //定义参照物
        int max = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        return max;

    }

    /*
    * 查找数组中最小值
    * */
    public static int getMin(int[] arry) {
        int min = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];
            }

        }
        return min;
    }

    /*
    * 数组元素求和
    * */
    public static int SumArray(int [] arry){
        int sum=arry[0];
        for (int i = 0; i < arry.length; i++) {
            sum+=arry[i];
        }
        System.out.println("数组求和的值为："+sum);
        return sum;
    }


}
