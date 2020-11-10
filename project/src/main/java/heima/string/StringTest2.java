package heima.string;
/*
* String判断功能
* */
public class StringTest2 {
    public static void main(String[] args) {
        //创建字符串对象
        String s1="hellow";
        String s2="hellow";
        String s3="Hellow";
        //比较两个字符串是否相同
        System.out.println("equals()比较两个字符串是否相等");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("equalsIgnoreCase()比较两个字符串是否相等，忽略大小写");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("startwith(String str )是否以str开头");
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("ll"));

        System.out.println("endtwith(String str )是否以str结尾");
        System.out.println(s1.endsWith("ow"));
        System.out.println(s1.endsWith("Ow"));
    }

}
