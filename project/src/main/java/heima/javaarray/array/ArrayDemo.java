package heima.javaarray.array;
/*
* 数组：存储同一种数据多个元素的容器
* 定义格式：
*   数据类型[] 数组名     推荐使用
*   数据类型 数组名[]
*   举例：int [] arr;
*        int arr [];
* 数组初始化：
*   A:所谓的初始化，就是为数据开辟内存空间，并为数组中的每个元素赋予初始值
*   B：数组初始化方式：
*       a:动态初始化：只给出长度，由系统初始化值
*           动态初始化：数据类型 [] 数组名=new 数据类型[数组长度]
*       b:静态初始化：给出初始值，由系统决定长度
*       数据类型[] 数组名=new 数据类型[]{元素1，元素2，元素3。。。}
* */
public class ArrayDemo {
    public static void main(String[] args) {
        //动态初始化 数据类型 [] 数组名=new 数据类型[数组长度]
        int [] arr = new int[3];
        //输出数组名
        System.out.println(arr);
//访问数字元素初始值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //给数组赋值
        arr[0]=100;
        arr[2]=200;
        //再次输出数组名和数组值
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //定义静态数组
        int[] arr3= {1, 2, 3};
        System.out.println(arr3);
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

    }
}
