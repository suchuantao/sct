package heima.string;

import java.util.Scanner;

/*使用StringBuilder反转字符串*/
public class StringbuilderTest16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
       String string=  scanner.nextLine();

       String ss=  StringBuilderStringFz(string);
        System.out.println(ss);
    }
    public static String StringBuilderStringFz(String string){
        StringBuilder sb=new StringBuilder(string);
        //字符串反转
        String string2 = "";
        for (int i = string.length()-1; i>=0 ; i--) {
            string2+=string.charAt(i);
        }

        String result=  string2.toString();

        return result;
    }
}
