package heima.io.filewrite.filereader.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest12 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fileReader=new FileReader("D:/project/target/FileReaderTest12.txt");
        //调用输入流对象的读数据方法
        //int read(char[] cbuf):一次读取一个字符数组
 //       char [] chs=new char[1024];//定义一个容器，这里的值一般填写1024的整数倍
//
//        //第一次读取数据
//        int len=fileReader.read(chs);
//        System.out.println(len);
//        String s=new String(chs);//把数组转换成String
//        System.out.println(s);//打印
//
//        //第二次读取数据
//        len=fileReader.read(chs);
//        System.out.println(len);
//        String s2=new String(chs);//把数组转换成String
//        System.out.println(s2);//打印

        //使用循环读取数据，当读不到数据的时候会返回-1
        char [] chars=new char[1024];
        int len;
        // 1 fileReader.read(chars);
        // 2 len=fileReader.read(chars);
        // 3 len!=-1
        while ((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

    }
}
