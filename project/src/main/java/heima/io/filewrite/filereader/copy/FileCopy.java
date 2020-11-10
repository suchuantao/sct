package heima.io.filewrite.filereader.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 需求：
* 把项目路径下的xx.java 复制到copy.java中
*   数据源：
*   FileWritetest1.java --读数据 FileReader
*   目的地 Copy.java
*   Copy 写数据  FileWrider
* */
public class FileCopy {
    public static void main(String[] args)throws IOException {
        //创建输入流对象
        FileReader fileReader=new FileReader("D://project//src//main//java//heima//io//filewrite//filereader//FileWriterTest01.java");
        //创建输出流对象
        FileWriter fileWriter=new FileWriter("Copy.java");
        //读写数据
        int ch2;
        while ((ch2=fileReader.read())!=-1){
            fileWriter.write(ch2);
        }
        //释放资源
        fileReader.close();
        fileWriter.close();
    }
}
