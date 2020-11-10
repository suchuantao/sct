package heima.io.filewrite.filereader.io;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/23 16:17
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流复制文本文件
 */
public class IODemo3 {
    public static void main(String[] args) throws IOException {
        method();


    }

    /**
     * 使用字节流复制文本文件
     * @throws IOException
     */
    public static void method() throws IOException {
        //创建输入流
        FileInputStream fileInputStream=new FileInputStream("D:\\project\\CopyIODemo.java");
        //创建输出流
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\project\\copyphoto\\CopyIODemo.java");

        //  一次读取一个字节数组
        int len;//存储读到的字节数组个数
        byte [] bytes=new byte[1024];
        while ((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
