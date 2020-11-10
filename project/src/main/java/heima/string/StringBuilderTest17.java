package heima.string;

import java.util.Scanner;

/*
 * 输入一个字符串，并反转，然后对比是否对称
 * */
public class StringBuilderTest17 {
    public static void main(String[] args) {
        //键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String string = scanner.nextLine();
        //调用方法
        boolean b = isSymmetry(string);
        //打印输出
        System.out.println(b);
    }

    public static boolean isSymmetry(String string) {
        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder(string);
        //初始化一个字符串
        String s2 = "";
        //使用for循环遍历并反转，从最后一个元素开始
        for (int i = string.length() - 1; i >= 0; i--) {
            //反转的后的累计在s2
            s2 += string.charAt(i);
        }
        //因为s2是StringBuilder类型，使用toString转换，并用result接受
        String result = s2.toString();
        //使用equals()把转换前的String与转换后的result进行对比，内容是否相等，并用issymmetry接收
        boolean issymmetry = result.equals(string);
        //返回issymmetry
        return issymmetry;
    }
}
