package heima.io.filewrite.filereader.buffereWriter;


import java.io.*;

/*
 * BuffereWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符，数组和字符串的高效写入
 * BufferedReader 从字符输入缓冲流中读取数据
 *
 *
 * */
public class BuffereWriter {
    public static void main(String[] args) throws IOException {
        //创建输出流缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedWriter.txt"));
        bufferedWriter.write("hello");
        bufferedWriter.write(123);
        bufferedWriter.flush();
        bufferedWriter.close();

        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D://project//src//main//java//heima//io//filewrite//filereader//FileWriterTest01.java"));

        /*第一种方法*/
        //一次读取一个字符
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            System.out.print((char) ch);
        }
        /*第二种方法*/
        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));

        }
        bufferedReader.close();


    }
}
