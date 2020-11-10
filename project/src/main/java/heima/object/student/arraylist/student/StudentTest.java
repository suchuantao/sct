package heima.object.student.arraylist.student;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();
        //创建学生对象
        Student student1 = new Student("史珍香", 17, "八一班");
        Student student2 = new Student("杜子腾", 18, "九二班");
        Student student3 = new Student("王浩", 16, "七十一班");
        Student student4 = new Student("周晓伦", 17, "八六班");
        Student student5 = new Student("李成", 16, "七三班");


        //把学生对象添加到arraylist集合中
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        //for循环遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            //使用student6接收获取的集合元素
            Student student6 = arrayList.get(i);
            //使用name接收 然后用student6来调用get方法
            String name = student6.getName();
            int age = student6.getAge();
            String classes = student6.getClasses();
            System.out.println(name);
            System.out.println(age);
            System.out.println(classes);


        }


    }
}
