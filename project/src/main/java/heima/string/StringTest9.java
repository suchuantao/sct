package heima.string;
/*
*去除字符串两端的空格
* String.trim()
*按照指定符合分割字符串
* String[] split(String str)
* */
public class StringTest9 {
    public static void main(String[] args) {
        String s1=" DDDDdddddd            ";
        String s11=s1.trim();
        System.out.println(s11);
    }

      String s2="aa,bb,cc,dd,dd";
     String [] s22=s2.split(".");




}
