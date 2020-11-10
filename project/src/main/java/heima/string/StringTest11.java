package heima.string;

import java.util.Scanner;

/*
 * 键盘录入一个字符串，然后实现字符串的反转
 * */
public class StringTest11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = scanner.nextLine();

        String s3 = Stringfz(s);
        System.out.println(s3);

        String s5 = StringToArray(s);
        System.out.println(s5);


    }

    //字符串反转的方法，把字符串倒着遍历
    public static String Stringfz(String s) {
        String s2 = "";
        //遍历获取指定字符串的索引
        for (int i = s.length() - 1; i >= 0; i--) {

            s2 += s.charAt(i);
        }
        return s2;
    }

    //方法二，把字符串转换成数字，对字符串进行反转，然后在把数组转换成字符串
    public static String StringToArray(String s) {

        //把字符串转换成数组
        char[] ch = s.toCharArray();
        //对数组进行反转
        for (int start = 0, end = ch.length - 1; start < end; start++, end--) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

        }
        //把数字转换成字符串
        String s3 = new String(ch);

        return s3;

    }
}
