package heima.string;
/*
* String 转换功能
*  char[] toCharArray 把字符串转换为数组
*  String toLowerCase 把字符串转换为小写
*  String toUpperCase 把字符串转为为大写
* */
public class StringTest7 {
    public static void main(String[] args) {
        String string="ABCDEFGWdddwefsfewe";
        //把字符串转换为数组,并使用for循环遍历
        System.out.println("把字符串转换为数组,并使用for循环遍历");
        char[] ch=string.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
        }

        System.out.println("把字符串转换为小写");
        String x= string.toLowerCase();
        System.out.println(x);

        System.out.println("把字符串转换为大写");
        String d=  string.toUpperCase();
        System.out.println(d);


    }



}
