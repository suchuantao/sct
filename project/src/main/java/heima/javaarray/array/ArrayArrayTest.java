package heima.javaarray.array;
/*
* 二维数组：其实就是元素为一维数组的数组
*   定义格式：
*       A：数据类型[][]数组名;(推荐使用)
*       B：数据类型 数组名[][];
*       C:数据类型[] 数组名[];
* 初始化：
*   A：动态初始化
*       数据类型 [][] 数组名= new 数据类型[m][n];
*       m表示二维数组中一维数组的个数
*       n表示一维数组中的元素个数
*   B静态初始化
*       数据类型 [][] 数组名=new 数据类型[][]{{元素...},{元素...}};
*       简化格式：数据类型 [][] 数组名={{元素...},{元素...}};
*
*
*
* */
public class ArrayArrayTest {
    public static void main(String[] args) {
        //数据类型 [][] 数组名={{元素...},{元素...}};
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr);//[[I@3e3abc88
        System.out.println(arr[0]);//[I@6ce253f1

        //获取二维数组中的元素
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);

        System.out.println("---------------");
        //使用for循环遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            
        }
    }
}
