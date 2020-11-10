package heima.string;

/*
 * 把数组中的数据按照指定格式拼接成一个字符串
 *   举例：int [] arr={1,2,3} 输出结果：[1,2,3]
 * */
public class StringTest10 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        String string = arrayToString(arr);
        System.out.println(string);


    }

    //把数组转成成String
    public static String  arrayToString(int[] arr) {
        String s = "";
        //[1,2,3,4,5]
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];


            } else {
                s += arr[i];
                s += ",";
            }
        }
        s += "]";
        return s;
    }
}
