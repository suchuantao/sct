package heima.comprehensive.student;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 键盘录入3个学生信息(学号，姓名，年龄，地址)存入集合，遍历集合把每一个学生信息存入文本文件（自定义分隔符）
 *
 * 分析
 *   A 定义学生类
 *   B 创建集合对象
 *   C 写方法实现键盘录入，并把学生对象作为元素添加到集合中
 *   D 创建输出缓冲流流对象
 *   E 遍历集合 ，得到每一个学生信息 把学生信息按照一定的格式写入文本文件
 *   F 释放资源
 * */
public class SutdentArrayListToFile {
    public static void main(String[] args) throws IOException {
//创建学生集合对象
        ArrayList<Student> arrayListstudent = new ArrayList<Student>();


        addStudent(arrayListstudent);
        addStudent(arrayListstudent);
        addStudent(arrayListstudent);



        //创建输出缓冲流对象
        BufferedWriter buffereWriter = new BufferedWriter(new FileWriter("SutdentArrayListToFile.txt"));



        //遍历集合
        int line;
        for (int i = 0; i < arrayListstudent.size(); i++) {
            //得到每一个学生信息
            Student student1 = arrayListstudent.get(i);
//把拿到的学生进行拼接：001，xxx,23,北京
            //拼接字符串使用StringBuilder对象
            StringBuilder stringBuilder = new StringBuilder();
            //使用append()方法进行拼接
            stringBuilder.append(student1.getId()).append(",").append(student1.getName()).append(",").append(student1.getAge()).append(",").append(student1.getArdess());
            //把拼接到的学生对象写入到文件中，需要转换成Stringd对象
            buffereWriter.write(stringBuilder.toString());
            //一次写一行
            buffereWriter.newLine();
            //刷新
            buffereWriter.flush();
        }
        //释放资源
        buffereWriter.close();

    }

    public static void addStudent(ArrayList<Student> arrayList) {

        String id;
        //键盘录入
        Scanner scanner = new Scanner(System.in);
//如果学号占用了，需要重新输入 所以使用while循环 判断条件为true
        while (true) {
            System.out.println("请输入学生编号：");
            id = scanner.nextLine();

            //定义标记
            boolean flag = false;
            //for循环遍历每个学生拿到学生id
            for (int i = 0; i < arrayList.size(); i++) {
                Student student2 = arrayList.get(i);
//拿到学生id和键盘录入的进行比较，如果相等，就把标记改为true
                if (student2.getId().equals(id)) {
                    flag = true;//当标记为true ，说明学号被占用了
                    break;//结束循环 当结束掉以后我们还要继续输入 ，所以又回到while循环
                }
            }
            if(flag){//flag=true 表示被占用了，然后给出提示
                System.out.println("你输入的学号被占用，请重新输入");
            }else {//说明没人占用，结束循环
                break;
            }


        }
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        String age = scanner.nextLine();
        System.out.println("请输入学生地址：");
        String adress = scanner.nextLine();

        //把键盘录入的信息添加到学生对象中
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setArdess(adress);
        //把学生对象添加到arrayList集合中
        arrayList.add(student);

        System.out.println("添加学习信息成功");

    }

}
