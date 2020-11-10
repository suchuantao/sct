package heima.io.filewrite.filereader.copy;
/*
 * /*
 * 需求：
 * 把项目路径下的xx.java 复制到copy.java中
 *   数据源：
 *   FileWritetest1.java --读数据 FileReader
 *   目的地 Copy.java
 *   Copy 写数据  FileWrider
 * */

import java.io.*;

public class FileCopy3 {
    public static void main(String[] args) throws IOException {
        //创建输出流缓冲对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D://project//src//main//java//heima//io//filewrite//filereader//FileWriterTest01.java"));
        //创建输入流缓冲对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Copy3.java"));
        //读写数据
        String line;
        // String readLine()一次读一行
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();//换行
            bufferedWriter.flush();//刷新
        }
        //释放资源
        bufferedWriter.close();
    }
}
