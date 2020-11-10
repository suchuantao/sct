package heima.string;
/*
* String的获取功能
*  int length() 获取字符串的长度，也就是字符串的个数
*  char charAt(int index) 获取指定字符串的索引
*  int indexOf(String str) 获取str在字符串中第一次出现的位置
*  String subString(int start) 从start开始截取字符串
*  String subString(int start,int end) 从start开始，到end的结束，包括start,不包括end
*
*
* */
public class StringTest4 {
    public static void main(String[] args) {
        String string="HelloWorld";

        System.out.println("获取字符串的长度");
        System.out.println(string.length());

        System.out.println("获取指定字符串的索引");
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(5));

        System.out.println("获取str在字符串中第一次出现的位置") ;
        System.out.println(string.indexOf("o"));

        System.out.println( "从l开始截取字符串");
        System.out.println(string.substring(2));

        System.out.println("从e开始，到r的结束");
        System.out.println(string.substring(1,8));

    }
}
