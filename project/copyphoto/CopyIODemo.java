package heima.io.filewrite.filereader.io;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/23 13:57
 */

/**
 * IO流分类
 *  流向
 *      输入流  读数据 FileReadr Readr
 *      输出流  写数据 FileWriter Writer
 *  数据类型
 *      字节流
 *          字节输入流 读数据 InputStream
 *          字节输出流 写数据 OutputStream
 *      字符流
 *          字符输入流 读数据 Reader
 *          字符输出流 写数据 Writer
 *
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流复制文本文件
 * 数据源
 * 目的地
 */
public class IODemo1 {
    public static void main(String[] args) throws IOException {
        method1();
        method2();



    }

    /**
     * 使用字符流复制文本文件,一次读取一个字符数组
     * @throws IOException
     */
    public static void method2() throws IOException {
        //创建字符输入流
        FileReader fileReader=new FileReader("D:\\project\\src\\main\\java\\heima\\io\\filewrite\\filereader\\io\\IODemo1.java");
        // 创建字符输出流
        FileWriter fileWriter=new FileWriter("D:\\project\\CopyIODemo.java");
        //一次读取一个字符数组
        char [] chars =new char[1024];
        int length;//用于存储读取的数组个数
        while ((length=(fileReader.read(chars)))!=-1){
            fileWriter.write(chars,0,length);
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();
    }

    /**
     * 使用字符流复制文本文件,一次读取一个字符
     * @throws IOException
     */
    public static void method1() throws IOException {
        //创建字符输入流
        FileReader fileReader=new FileReader("D:\\project\\src\\main\\java\\heima\\io\\filewrite\\filereader\\io\\IODemo1.java");
        // 创建字符输出流
        FileWriter fileWriter=new FileWriter("D:\\project\\CopyIODemo.java");
        //一次读取一个字符
        int ch = 0;
        while ((fileReader.read())!=-1){
            fileWriter.write(ch);
            fileWriter.flush();
        }



        //释放资源
        fileReader.close();
        fileWriter.close();
    }
}
