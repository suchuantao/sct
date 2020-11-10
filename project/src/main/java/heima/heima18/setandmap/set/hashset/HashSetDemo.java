package heima.heima18.setandmap.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/19 11:19
 */

/**
 * HashSet的add()方法，首先会使用当前集合中的每一个元素和新添加的元素进行hash值比较
 *  如果hash值不一样，添加新元素
 *  如果hash值一样，比较地址值或者使用equals方法进行比较
 *  比较结果一样，则认为重复不添加
 *  所有的结果不一样则添加
 */





public class HashSetDemo {
    public static void main(String[] args) {
        //创建HashSet对象
        HashSet<Student> hashSet=new HashSet<Student>();
        //创建学生对象
        Student student1=new Student("张无忌",28);
        Student student2=new Student("赵敏",25);
        Student student3=new Student("赵敏",25);
        //把学生对象添加到HashSet集合中
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);

        method1(hashSet);
        method2(hashSet);
        method3(hashSet);
    }

    /**
     * 使用增强for遍历HashSet
     * @param hashSet
     */
    public static void method3(HashSet<Student> hashSet) {
        for (Student s:hashSet) {
            System.out.println(s);
        }
    }

    /**
     * 先把集合转换成数组，然后遍历数组
     * @param hashSet
     */
    public static void method2(HashSet<Student> hashSet) {
        //把set集合换行成数组
        Object [] objects=  hashSet.toArray();
        //遍历数组
        for (int i = 0; i < objects.length; i++) {
          Object o =  objects[i];
            System.out.println(o);
        }
    }

    /**
     * 使用迭代器遍历HashSet集合
     * @param hashSet
     */
    public static void method1(HashSet<Student> hashSet) {
        //遍历集合
        Iterator<Student> iterator=hashSet.iterator();
        while (iterator.hasNext()){
           Student s= iterator.next();
            System.out.println(s);
        }
    }
}
