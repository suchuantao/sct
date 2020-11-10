package heima.string;
/*
* 字符串遍历
*
* */
public class StringTest5 {
    public static void main(String[] args) {
        //
        String string="abcdefghijklmnopqrstuvwxzy";
        //使用for循环
        for (int i = 0; i <string.length() ; i++) {
            System.out.print(string.charAt(i));

        }
    }
}
