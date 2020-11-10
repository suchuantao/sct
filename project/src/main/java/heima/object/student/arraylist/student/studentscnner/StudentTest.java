package heima.object.student.arraylist.student.studentscnner;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {


    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Student> arrayList = new ArrayList<Student>();
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);

        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            Student student3 = arrayList.get(i);
            String name = student3.getName();
            String age = student3.getAge();
            String classes = student3.getClasses();
            System.out.println(name);
            System.out.println(age);
            System.out.println(classes);

        }
    }


    public static void addStudent(ArrayList<Student> arr) {
        //创建一个学生对象
        Student student = new Student();
        //键盘录入，把键盘录入的数据赋值给成员变量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        String age = scanner.nextLine();
        System.out.println("请输入学生班级：");
        String classes = scanner.nextLine();
        student.setName(name);
        student.setAge(age);
        student.setClasses(classes);
        //把学生对象添加到集合中
        arr.add(student);

    }


}
