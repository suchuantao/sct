package heima.io.filewrite.filereader.buffereWriter;

import java.io.*;

/*
* 缓冲流的特殊功能
*  BufferedWrite
*   void newLine():写一个换行符，由系统决定
*  BufferedReader
*   String readLine()：一次读取一行数据，但不会读取换行符
*
* */
public class BuffereSpecial {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffereWriter=new BufferedWriter(new FileWriter("buffereWriter2.txt"));
        for (int i = 0; i < 10; i++) {
            buffereWriter.write("hello"+i);
            buffereWriter.newLine();//换行
            buffereWriter.flush();//刷新

        }
        buffereWriter.close();

        BufferedReader bufferedReader=new BufferedReader(new FileReader("D://project//src//main//java//heima//io//filewrite//filereader//FileWriterTest01.java"));
        String line;
        //String readLine()：一次读取一行数据，但不会读取换行符;当读取完数据以后再次读取的时候会显示null,所以我们判断非null,就代表有数据并输出
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);

        }
        bufferedReader.close();

    }
}
