package heima.string;
/*
* StringBuilder与String互转
* StringBuilder-------String
*   使用String toString();
*
*  String转换为StringBuilder
*   StringBuilder(String s) 通过构造方法就可以把 String转换为StringBuilder
* */
public class StringTest14 {
    public static void main(String[] args) {
        //StringBuilder转换为String

        System.out.println("StringBuilder转换为String:");
        //创建一个StringBuffer对象
        StringBuffer sb= new StringBuffer();
        //使用append()方法拼接字符串
        sb.append("hello").append("world");
        //使用public String toString()方法把StringBuilder转换为String
        String string= sb.toString();
        System.out.println(string);

        System.out.println("String转换为StringBuilder:");
        //String转换为StringBuilder
        String s="helloworld";
        StringBuilder sb2= new StringBuilder(s);
        System.out.println(sb2);
    }
}
