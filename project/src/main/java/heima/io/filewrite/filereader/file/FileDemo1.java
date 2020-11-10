package heima.io.filewrite.filereader.file;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/22 9:23
 */

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;

/**
 * File 文件和目录路径名的抽象变现形式，File类的实例不可变
 *  构造方法
 *  File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例
 *  File(String pathname)  通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 *  File(String parent, String child)  根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例
 *  boolean delect() 删除文件或者文件夹
 *   注意：删除文件夹的时候，文件夹下面不能有子文件夹或者文件，否则删除失败
 */
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //构造方法一 将指定的路径名转换成一个File对象
        File file1=new File("D:\\project\\File\\file.txt");
        //构造方法二 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例
        File file2=new File("D:\\project\\File","file.txt");
        //构造方法三 据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例
        File parent=new File("D:\\project\\File");
        File file3=new File(parent,"file.txt");
        File file4=new File("d");


        //返回由此抽象路径名表示的文件的长度。
        long l= file1.length();
        System.out.println(l);
        // 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
        File[] f =file1.listFiles();
        System.out.println(f);
        //计算此抽象路径名的哈希码。
        int hash=  file1.hashCode();
        System.out.println(hash);
        method2(file1);
        //指定文件不存在时创建文件并返回true,否则返回false
      boolean b3=  file1.createNewFile();
        System.out.println(b3);
        //指定文件夹不存在时创建文件夹并返回true,否则返回false
      boolean b4=  file4.mkdir();
        System.out.println(b4);
        //删除文件成功返回true,否则返回false
       boolean delect =  file3.delete();
        System.out.println(delect);
        //删除文件夹成功返回true 否则返回false
      boolean delect2= file4.delete();
        System.out.println(delect2);
// 判断File对象指向的路径是否是绝对路径，如果是绝对路径返回true,否则返回false
       boolean b5= file1.isAbsolute();
        System.out.println(b5);
//以File对象的形式返回当前File对象所指向的绝对路径
       File f5= file1.getAbsoluteFile();
        System.out.println(f5);
        //返回File对象所指向的绝对路径
       String f8=  file1.getAbsolutePath();
        System.out.println(f8);

        //判断是否是文件夹
       boolean f6=  file1.isFile();
        System.out.println(f6);
        //判断是否是文件
       boolean f7=  file1.isDirectory();
        System.out.println(f7);

        //表示此抽象路径名的 file: URI。
        method5();
        //调用获取文件或文件夹名称
         method4();

        //调用获取当前路径下所有文件和文件夹方法
        method3();

//调用返回路径名的路径名字符串
        method5(parent);
//调用获取最后一次修改文件夹时间方法
        getdate(file1);

        method6();


        method7();


    }

    /**
     * 获取所有盘符
     */
    public static void method7() {
        File[] filess= File.listRoots();
        for (File file:filess) {
            System.out.println(file);
        }
    }

    /**
     *返回抽象路径名数组，表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
     */
    public static void method6() {
        //返回当前路径下所有文件和文件夹
        File file10=new File("F:\\陈立推荐java视频第一部分\\01.java基础(共300集左右)\\20 IO流-高级\\20 IO流-高级\\视频\\avi");
        File [] files=file10.listFiles();
        for (File file:files) {
            System.out.println(file);
        }
    }

    /**
     * 表示此抽象路径名的 file: URI。
     * @return
     */
    public static File method5() {
        //构造方法一 将指定的路径名转换成一个File对象
        File file1=new File("D:\\project\\File\\file.txt");
        //表示此抽象路径名的 file: URI。
        URI url= file1.toURI();
        System.out.println(url);
        return file1;
    }

    /**
     * 返回路径名的路径名字符串
     * @param parent
     * @return
     */
    public static File method5(File parent) {
        File file3=new File(parent,"file.txt");
        //返回路径名的路径名字符串
        String s1= file3.toString();
        System.out.println(s1);
        return file3;
    }

    /**
     * 获取文件或文件夹名称
     * @return
     */
    public static File method4() {
        //获取文件或文件夹名称
        //构造方法一 将指定的路径名转换成一个File对象
        File file1=new File("D:\\project\\File\\file.txt");
        String s2= file1.getName();
        System.out.println(s2);
        return file1;
    }

    /**
     * 返回当前路径下所有文件和文件夹
     * 注意：只有指向文件夹的File对象才可以调用该方法
     */
    public static void method3() {
        //返回当前路径下所有文件和文件夹
        File file10=new File("F:\\陈立推荐java视频第一部分\\01.java基础(共300集左右)\\20 IO流-高级\\20 IO流-高级\\视频\\avi");
        String [] strings= file10.list();
        for (int i = 0; i <strings.length; i++) {
           String s= strings[i];
            System.out.println(s);
        }
    }

    public static void method2(File file1) {
        //测试此抽象路径名表示的文件或目录是否存在。
        boolean exists= file1.exists();
        System.out.println(exists);
    }

    /**
     * 获取最会一次修改文件夹时间，并对文件进行格式化
     * @param file1
     */
    public static void getdate(File file1) {
        //返回最后一次修改文件时间
        long l2= file1.lastModified();
        //设置显示时间格式
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //格式化时间
        String formatStr =simpleDateFormat.format(l2);
        //输出时间
        System.out.println(formatStr);
    }
}
