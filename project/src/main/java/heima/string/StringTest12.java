package heima.string;
/*
* StringBuilder:是一个可变的字符串，字符串缓冲区类
* String和StringBuilder区别
*   String 是固定不变的
*   StringBuilder 内容是可变的
* */
public class StringTest12 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();

        //返回当前容量
        System.out.println("返回sb里面的容量:");
       int rl= sb.capacity();
        System.out.println(rl);

        //返回当前长度
        System.out.println("返回sb里面的长度:");
        int length= sb.length();
        System.out.println(length);
    }

}
