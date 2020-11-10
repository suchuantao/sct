package heima.io.filewrite.filereader.filereader;

import java.io.FileReader;
import java.io.IOException;

/*
* 读数据 输入流 FileReader
*   FileReader:
*       FileReader(String fileName)
*       输入流读文件的步骤：
*           A 创建输入流对象
*           B 调用输入流对象读数据方法
*           C 释放资源
* */
public class FileReaderTest10 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fileReader=new FileReader("d:/a.txt");
        //调用输入流的读数据方法
        //int read()一次读取一个字节
        int ch=  fileReader.read();
        System.out.println(ch);
        System.out.println((char) ch);

        //当我们读取多个数据时，判断返回值为-1，则代表数据读取完毕
        int ch2;
        while ((ch2=fileReader.read())!=-1){
            System.out.print(ch2);
            System.out.print((char) ch2);
        }
        //释放资源
        fileReader.close();
    }
}
