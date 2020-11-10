package heima.string;

import java.util.Scanner;

/*
* 键盘录入一个字符串，把首字母转大写，其余小写，然后输出
* */
public class StringText8 {
    public static void main(String[] args) {
        //键盘录入数据
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String string=scanner.nextLine();
        //截取字符串首字母并转大写
        String string2=string.substring(0,1);
        String string22= string2.toUpperCase();
        //把字符串首字母以外的转小写
        String string3=string.substring(1);
        String string33= string3.toLowerCase();
        //把首字母转大写，其余转小写，然后拼接在一起
      //  String string4=string2.toUpperCase()+string3.toLowerCase();
        String string4=string22+string33;
        System.out.println(string4);
    }
}
