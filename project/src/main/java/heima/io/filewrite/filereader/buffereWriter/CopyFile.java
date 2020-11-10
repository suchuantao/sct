package heima.io.filewrite.filereader.buffereWriter;

import java.io.*;

/*
 * 需求：把项目路径下的xx，复制到Copy文件中
 * 数据源 BuffereWriter ----FileReader-----BufferedReader
 * 目的地 Copy.java 写数据 FileWrite ------BufferedWrite
 * */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D://project//src//main//java//heima//io//filewrite//filereader//buffereWriter//BuffereWriter.java"));
        //创建输出流缓冲对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CopyBuffereWriter.java"));

        //读写数据
        //一次读取一个字符
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            bufferedWriter.write(ch);
        }

        //一次读取一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = bufferedReader.read(chs)) != -1) {
            bufferedWriter.write(chs, 0, len);
        }
        //释放资源
        bufferedReader.close();
        bufferedWriter.close();
    }
}
