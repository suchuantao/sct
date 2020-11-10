package heima.heima17.arraylist.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/16 14:02
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<Student> collection = new ArrayList<Student>();
        //创建学生对象1
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        //创建学生对象2
        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(20);
        //把学生对象添加到集合中
        ((ArrayList<Student>) collection).add(student1);
        ((ArrayList<Student>) collection).add(student2);
        //遍历集合
        Iterator<Student> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Student student3 = iterator.next();
            String s4 = student3.getName();
            int s5 = student3.getAge();
            System.out.println(s4 + s5);


        }

    }
}
