package heima.jinjie.array;

public class Arrays {
    /*
     * 查找数组元素中最大值
     *
     * */
    public static int getMax(int[] arry) {
        //定义参照物
        int max = 0;
        //遍历数组
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        return max;
    }

    /*
     * 返回数组中指定索引
     *
     * */
    public static int getIndex(int[] arry, int a) {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == a) {
                return i;
            }
        }//如果查不到索引就返回-1
        return -1;
    }
}
