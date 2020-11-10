package heima.io.filewrite.filereader.copy;

import java.io.*;

/*
* 使用5种方法复制文件
* */
public class CopyFile4 {
    public static void main(String[] args) throws IOException{
        //源文件
        String srcFileName="D://project//src//main//java//heima//io//filewrite//filereader//FileWriterTest01.java";
        //复制后的文件
        String destFileName="Copy4.java";

        method1(srcFileName,destFileName);
        method2(srcFileName,destFileName);
        method3(srcFileName,destFileName);
        method4(srcFileName,destFileName);
        method5(srcFileName,destFileName);
    }




    //方式一：使用基本流一次读取一个字符
    public static void method1(String srcFileName,String destFileName) throws IOException {
        //创建输入流对象
        FileReader fileReader=new FileReader(srcFileName);
        //创建输出流对象
        FileWriter fileWriter=new FileWriter(destFileName);
        //一次写一个字符
        int ch;
        while ((ch=fileReader.read())!=-1){
            fileWriter.write(ch);
        }
        //释放资源
        fileReader.close();
        fileWriter.close();


    }

    // 方式二 ： 使用基本流一次读取一个字符数组
    public static void method2(String srcFileName,String destFileName)throws IOException{
        //创建输入流对象
        FileReader fileReader=new FileReader(srcFileName);
        //创建输出流对象
        FileWriter fileWriter=new FileWriter(destFileName);

        //一次写一个字符数组
        char [] chars=new char[1024];
        int len;
        while ((len=fileReader.read(chars))!=-1){
            fileWriter.write(chars,0,len);

        }
        fileReader.close();
        fileWriter.close();

    }

    //方式三 缓冲流一次读取一个字符
    public static void method3(String srcFileName,String destFileName)throws IOException{
        //创建缓冲输入流对象
        BufferedReader bufferedReader=new BufferedReader(new FileReader(srcFileName));
        //创建缓冲输出流对象
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(destFileName));
        //使用缓冲流一次读取一个字符
        int ch;
        while ((ch=bufferedReader.read())!=-1){
            bufferedWriter.write(ch);
        }
        //释放资源
        bufferedReader.close();
        bufferedWriter.close();

    }

    //方式四 ：缓冲流一次读取一个字符数组
    public static void method4(String srcFileName,String destFileName) throws IOException{
        //创建缓冲输入流对象
        BufferedReader bufferedReader=new BufferedReader(new FileReader(srcFileName));
        //创建缓冲输出流对象
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(destFileName));
        //使用缓冲流一次读取字符数组
        char[] chars=new char[1024];
        int len;
        while ((len=bufferedReader.read(chars))!=-1){
            bufferedWriter.write(chars,0,len);
        }
        bufferedReader.close();
        bufferedWriter.close();

    }

    //方式五 缓冲流一次读取一行数据
    public static void method5(String srcFileName,String destFileName) throws IOException{
        //创建缓冲输入流对象
        BufferedReader bufferedReader=new BufferedReader(new FileReader(srcFileName));
        //创建缓冲输出流对象
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(destFileName));

        //一次读取一行数据
        String line;
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
