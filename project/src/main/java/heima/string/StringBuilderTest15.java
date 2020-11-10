package heima.string;
/*
* 把数组拼接成一个字符串
*   举例：int [] arr={1,2,3]
*              [1,2,3]
* */
public class StringBuilderTest15 {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr={1,2,4,5,6,7,8};
        String result=  arrayToString(arr);
        System.out.println(result);

    }
    public static String arrayToString(int [] arr){
        //创建一个StringBuffer
        StringBuilder sb=new StringBuilder();
        //先拼接一个[
        sb.append("[");
        //for循环遍历
        for (int i = 0; i <arr.length ; i++) {
            //判断如果是最后一个长度就打印元素
            if(i==arr.length-1){
                sb.append(arr[i]);
                //如果不是，则打印元素跟后面的逗号
            }else {
                sb.append(arr[i]).append(",");
            }

        }
        //拼接]
        sb.append("]");
        //把StringBuilde转换为String
          String string= sb.toString();

        //返回一个String
        return string;
    }
}
