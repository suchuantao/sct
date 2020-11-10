package heima.string;

/*
 * 添加功能 pubilc static StringBuilder append(任意类型)
 * 反转功能 pubilc static Stringfz
 * */
public class StringTest13 {
    public static void main(String[] args) {
        //创建对象
        StringBuffer sb = new StringBuffer();
        StringBuffer b2 = sb.append("hello");
        StringBuffer b3 = sb.append(124);
        StringBuffer b4 = sb.append(32.32);
        StringBuffer b5=  sb.append(true);
        System.out.println(b4);

        //链式编程
        System.out.println("链式编程");
      StringBuffer b6=  sb.append(123).append("哈哈").append(4).append('a');
        System.out.println(b6);

    }


}
