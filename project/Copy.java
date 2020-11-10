package heima.io.filewrite.filereader;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 往文件中写数据
 *   写数据-输出流-FileWrider
 *   FileWrider (String fileName):传递一个文件名称
 *   输出流写数据步骤：
 *       A：创建输出流对象
 *       B：调用输出流对象的写数据方法
 *       C：释放资源
 * */
public class FileReaderTest01 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fileWriter = new FileWriter("d://a.txt");
        //调用输出流对象写数据
        //写一个字符串数据
        fileWriter.write("hahahhahhahahhahah");
        //写入一个字符数据,也可以写字符对应的int值
        fileWriter.write('A');
        fileWriter.write(87);
        //写一个字符串中的一部分
        fileWriter.write("abcedeffhdfs", 2, 5);
        //写一个字符数组到文件中
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        fileWriter.write(ch);
        fileWriter.write(ch, 2, 3);
//写入数据追加
        FileWriter fileWriter1 = new FileWriter("d://aa.txt", true);//表示追加写入，默认为false不追加
        //实现写入数据换行 windows \r\t;linux \n; mac \r
        for (int i = 0; i < 10; i++) {
            fileWriter1.write("hello" + i);
            fileWriter1.write("\r\t");

        }

        //数据没有写入到文件，其实是在缓冲区调用flush()
        fileWriter.flush();
        fileWriter1.flush();
        //释放资源
        fileWriter.close();
        fileWriter1.close();
    }

}
