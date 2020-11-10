package heima.comprehensive.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把文本文件中的学生信息读取出来存储到集合中，然后遍历集合，在控制台输出
 *
 * 分析
 *   A 定义学生类
 *   B 创建输入缓冲流对象
 *   C 创建集合对象
 *   D 读取文件数据 然后把数据按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合
 * */
public class StudentFileToArrayList {
    public static void main(String[] args) throws IOException {
        //创建输入缓冲流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("SutdentArrayListToFile.txt"));
        //创建集合对象
        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        //读取文件信息
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //把读取到的数据按照","进行分割,使用字符串数组进行接收
            String[] string = line.split(",");
            //创建一个学生对象
            Student student = new Student();
            //把读取到的信息添加到学生对象中
            student.setId(string[0]);
            student.setName(string[1]);
            student.setAge(string[2]);
            student.setArdess(string[3]);
            //把学生对象添加到arrayList集合中
            studentArrayList.add(student);

        }
        //释放资源
        bufferedReader.close();
        System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
        //遍历数组
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student2 = studentArrayList.get(i);
            String id = student2.getId();
            String name = student2.getName();
            String age = student2.getAge();
            String ardess = student2.getArdess();
            System.out.println(id + "\t\t" + name + "\t\t" + age + "\t\t" + ardess);
        }
    }
}
