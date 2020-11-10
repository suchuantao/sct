package heima.io.filewrite.filereader.arraylisttofile;

import java.io.*;
import java.util.ArrayList;

/*
 * 把arrayList集合中的字符串存储到文本文件
 * 每一个字符串元素作为文件中的一行数据
 *
 * 分析：
 *   A 创建集合对象
 *   B 往集合元素中添加数据
 *   C 创建输出缓冲流   BufferedWriter
 *   D 遍历集合，得到每一个字符串，然后把该字符串元素作为数据写到文本文件
 * */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        //创建一个arrayList集合对象
        ArrayList<String> arrayList = new ArrayList<String>();
        //往集合中添加元素
        arrayList.add("a");
        arrayList.add("王武");
        arrayList.add("愿你归来仍是少年");
        arrayList.add("难忘");
        arrayList.add(2, "444");

        //创建输出缓冲流

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ArrayListToFileTest.txt"));

        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            String string = arrayList.get(i);
            System.out.println(string);
            //写数据
            bufferedWriter.write(string);
            //一次写一行的方式
            bufferedWriter.newLine();
            //刷新
            bufferedWriter.flush();

        }
        //释放资源
        bufferedWriter.close();

    }
}
