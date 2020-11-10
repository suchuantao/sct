package heima.io.filewrite.filereader.arraylisttofile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 从文本文件中读取数据到arrayList集合中 并遍历集合
 * 每一行作为一个字符串元素输出
 *
 * 分析：
 *   A 创建输入缓冲流对象
 *   B 创建集合对象
 *   C 读取数据 每次读取一行数据 把该行数据作为一个元素存储到集合中
 *   D 释放资源
 *   F 遍历集合
 *
 * */
public class FileToArrayListTest {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("ArrayListToFileTest.txt"));
        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<String>();
        //读取数据 每次读取一行数据 把该行数据作为一个元素存储到集合中
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
        //释放资源
        bufferedReader.close();

        //遍历集合
        for (int i = 0; i <arrayList.size(); i++) {
          String string=  arrayList.get(i);
            System.out.println(string);

        }
    }



}
