package com.rest.demo.sum.studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerTest {
    public static void main(String[] args) {
//创建arrayList集合用于存储学生对象
        ArrayList<StudentManager> studentManagers = new ArrayList<StudentManager>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1：查看所有学生");
            System.out.println("2：添加学生");
            System.out.println("3：删除学生");
            System.out.println("4：修改学生");
            System.out.println("5：退出登录");
            System.out.println("请输入你的选择");
            //创建键盘录入
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //查看学生
                    //调用查询方法
                    findStudent(studentManagers);
                    break;

                case 2:
                    //添加学生
                    addStudents(studentManagers);
                    break;
                case 3:
                    //删除学生
                    deleteStudent(studentManagers);
                    break;
                case 4:
                    //修改学生
                    updateStudents(studentManagers);
                    break;
                case 5:
                    //退出登录


                default:
                    System.out.println("谢谢你的使用！");
                    System.exit(0);//jvm退出
                    break;

            }


        }
    }

    /*
     *查看学生
     *
     * */
    public static void findStudent(ArrayList<StudentManager> studentManagers) {
        //在查看学生之前，如果没有数据需要进行判断，不让继续查看，判断集合的长度即可
        if (studentManagers.size() == 0) {
            System.out.println("目前没有学生信息可供查看，请重新输入操作！");
            return;//程序不会继续执行，回到以前的操作
        } else {
            System.out.println("学生编号\t\t学生姓名\t\t学生年龄\t\t学生地址\t\t");
            for (int i = 0; i < studentManagers.size(); i++) {
                StudentManager studentManager2 = studentManagers.get(i);
                String id = studentManager2.getId();
                String name = studentManager2.getName();
                String age = studentManager2.getAge();
                String address = studentManager2.getAddress();
                System.out.println(id + "\t\t\t" + name + "\t\t\t" + age + "\t\t\t" + address);
            }
        }
    }

    /*
     * 添加学生方法
     * */
    public static void addStudents(ArrayList<StudentManager> studentManagers) {


//键盘录入
        Scanner scanner = new Scanner(System.in);
        //为了程序继续这里执行，使用while循环回到这里
        String id;
        while (true) {
            System.out.println("请输入学生编号：");
            id = scanner.nextLine();
//判断学号不可重复
            //先定义标记
            boolean b = false;//代表标记没有重复
            //遍历下集合,得到每一个学生
            for (int i = 0; i < studentManagers.size(); i++) {
                StudentManager studentManager3 = studentManagers.get(i);
                //获取编号与键盘录入的进行对比
                if (studentManager3.getId().equals(id)) {
                    b = true;//把定义的标记复制给ture,代表编号重复了
                    break;//暂用后就结束
                }
            }
            if (b) {
                System.out.println("你输入的编号已被占用，请重新输入");
            } else {
                break;//结束循环
            }

        }


        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        String age = scanner.nextLine();
        System.out.println("请输入学生地址：");
        String address = scanner.nextLine();

        //创建学生对象
        StudentManager studentManager = new StudentManager();
        //使用set方法添加键盘录入的数据到学生对象里面
        studentManager.setId(id);
        studentManager.setName(name);
        studentManager.setAge(age);
        studentManager.setAddress(address);
        //把学生对象作为元素添加到集合中
        studentManagers.add(studentManager);

        //添加完成后给出提示
        System.out.println("添加学生成功！");


    }


    //删除学生
    public static void deleteStudent(ArrayList<StudentManager> studentManagers) {
//键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的学生编号：");
        String id = scanner.nextLine();
        //定义一个索引
        int index = -1;
        //fou循环遍历学生对象
        for (int i = 0; i < studentManagers.size(); i++) {
            StudentManager studentManager4 = studentManagers.get(i);
            //那键盘录入id与学生对象的id进行对比
            if (studentManager4.getId().equals(id)) {

                index = i;
                //  studentManagers.remove(i);//根据索引删除
                break;//删除完结束循环

            }
        }
        if (index == -1) {
            System.out.println("你输入的学生编号对应的学生不存在，无法删除，请重新输入：");
        } else {
            //如果存在进进行移除
            studentManagers.remove(index);
            System.out.println("删除学生信息成功！");

        }


    }

    //修改学生信息
    public static void updateStudents(ArrayList<StudentManager> studentManagers) {
        //键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要修改的学生编号：");
        String id = scanner.nextLine();
        //定义一个索引
        int index = -1;
        //遍历集合
        for (int i = 0; i < studentManagers.size(); i++) {
            StudentManager studentManager5 = studentManagers.get(i);
            //拿学生对象的编号与键盘录入的学号进行对比
            if (studentManager5.getId().equals(id)) {
                index = i;
                break;

            }
        }
        if (index == -1) {
            System.out.println("你输入的修改学生编号不存在，请重新输入！");
        } else {
            System.out.println("请输入学生新姓名：");
            String name = scanner.nextLine();
            System.out.println("请输入学生新的年龄：");
            String age = scanner.nextLine();
            System.out.println("请输入学生新的地址：");
            String adress = scanner.nextLine();
            //创建一个学生对象
            StudentManager studentManager6 = new StudentManager();
            //把修改后的信息添加到学生对象中
            studentManager6.setId(id);
            studentManager6.setName(name);
            studentManager6.setAge(age);
            studentManager6.setAddress(adress);
            //把修改学生对象再添加到集合中
            studentManagers.set(index, studentManager6);

            System.out.println("修改学生信息成功！");
        }

    }
}
