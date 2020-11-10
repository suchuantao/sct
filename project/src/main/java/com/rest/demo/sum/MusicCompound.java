package com.rest.demo.sum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MusicCompound extends IOException {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;//输入出示为空
        FileOutputStream fileOutputStream = null;//输出初始为空
        String filename[] = {"D:/project/demomusic-java/__MACOSX/示例歌曲/._我只在乎你.mp3", "D:/project/demomusic-java/__MACOSX/示例歌曲/._星月神话.mp3"};
        //设置byte数组，每次往输出流中传入8k的内容
        byte by[] = new byte[1024 * 8];
        try {
            fileOutputStream = new FileOutputStream("D:/project/demomusic-java/__MACOSX/示例歌曲/._合并3.mp3");
            for (int i = 0; i < 2; i++) {
                int count = 0;
                fileInputStream = new FileInputStream(filename[i]);
                //跳过前面3m的歌曲内容
                try {
                    fileInputStream.skip(1024 * 1024 * 3);
                    while (fileInputStream.read(by) != -1) ;
                    {
                        fileOutputStream.write(by);
                        count++;
                        System.out.println(count);
                        if (count == 1024 * 2 / 8) ;
                        {
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                //输出完成后关闭输入输出流
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
