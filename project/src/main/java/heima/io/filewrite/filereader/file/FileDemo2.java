package heima.io.filewrite.filereader.file;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/23 10:04
 */

import java.io.File;

/**
 * 输出指定目录下所有的java文件名（包含子目录）
 */
public class FileDemo2 {
    public static void main(String[] args) {
        //创建一个文件目录
        File file = new File("D:\\project");
        method(file);

    }

    public static void method(File file) {

        //判断File对象是否是一个文件
        if (file.isDirectory()) {
            //获取当前文件对象所表示的路径下的所有文件或文件夹名称，返回的是一个File数组
            File[] files = file.listFiles();
            //遍历File文件数组
            for (int i = 0; i < files.length; i++) {
                File f = files[i];
                //判断是否是一个文件对象
                if (f.isFile()) {
                    //获取文件名并以.java文件名结尾
                    if (f.getName().endsWith(".java")) {
                        //符合条件 输出文件名
                        String fileName = f.getName();
                        System.out.println(fileName);

                    }

                }
                //递归，是一个目录对象 则执行递归 调用该方法
                else {
                    method(f);

                }
            }

        }
    }
}
