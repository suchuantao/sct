package heima.io.filewrite.filereader.io;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/23 15:11
 */

import java.io.*;

/**
 * 分别使用字节流和字符流复制图片
 * 二进制文件只能使用字节流进行复制
 * 字符流只能复制文本文件
 */
public class IODemo2 {
    public static void main(String[] args) throws IOException {
        method2();
        method1();



    }

    public static void method1() throws IOException {
        //创建字节流输入流
        FileInputStream fileInputStream=new FileInputStream("D:\\project\\photo\\timg.jpg");
        //创建字节输入流
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\project\\copyphoto\\timg.jpg");
        //一次读取一个字节数组
        int len;
        byte [] bytes=new byte[1024];
        while ((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);

        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /**
     * 使用字符流复制图片，复制的图片打不开
     * @throws IOException
     */
    public static void method2() throws IOException {
        //创建字符输入流
        FileReader fileReader=new FileReader("D:\\project\\photo\\timg.jpg");
        //创建字符输出流
        FileWriter fileWriter=new FileWriter("D:\\project\\copyphoto\\timg.jpg");
        //一次读取一个字符数组
        char [] chars=new char[1024];
        int len;//存储读取字符个数
        while ((len=fileReader.read(chars))!=-1){
            fileWriter.write(chars,0,len);
            fileWriter.flush();

        }

        fileReader.close();
        fileWriter.close();
    }
}
