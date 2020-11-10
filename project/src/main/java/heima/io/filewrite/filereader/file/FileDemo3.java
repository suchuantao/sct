package heima.io.filewrite.filereader.file;

import java.io.File;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/23 11:28
 */
public class FileDemo3 {
    public static void main(String[] args) {
        File file=new File("D:\\project\\test");
        method(file);

    }
    public static void method(File file){
        //判断是否是一个目录
        if(file.isDirectory()){
            //删除自己的所有子文件和子目录
            //获取所有的子文件和子目录
          File [] files=  file.listFiles();
          //获取到子文件和目录后进行遍历
            for (File listFiles:files) {
                //获取到的如果是文件
                if (listFiles.isFile()){
                    //如果是文件执行删除
                    listFiles.delete();

                }
                //获取到的如果是目录
                else if  (listFiles.isDirectory()){
                    //继续查看目录下是否有子文件或者子目录 然后调用删除指定文件方法
                    method(listFiles);

                }

            }

            //删除掉本目录
            file.delete();

        }

    }
}
