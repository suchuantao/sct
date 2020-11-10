package heima.heima18.setandmap.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/19 10:34
 */

/**
 * Set集合的特点
 *  无序
 *  元素唯一，不可重复
 *  没有索引
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建set对象
        Set<String> set = new HashSet<String>();//父类引用指向子类对象
        //向集合添加元素
        set.add("紫衫龙王");
        set.add("青翼蝠王");
        set.add("金毛狮王");
        set.add("白眉鹰王");
        set.add("金轮法王");

        method1(set);
        method2(set);

        method3(set);

    }

    /**
     * set集合遍历方法三
     * 使用增强for循环遍历set集合
     * @param set
     */
    public static void method3(Set<String> set) {
        System.out.println("---使用增强for循环遍历set集合---");
        //使用增强for循环遍历set集合
        for (String s:set) {
            System.out.println(s);
        }
    }

    /**
     * set集合遍历方式一
     * 使用迭代器遍历set集合
     * @param set
     */
    public static void method2(Set<String> set) {
        System.out.println("---使用迭代器遍历set集合---");
        //使用迭代器遍历set集合
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
           String  s2= iterator.next();
            System.out.println(s2);
        }
    }

    /**
     * set集合遍历方式一
     * set集合先转数组，使用for循环进行遍历
     * @param set
     */
    public static void method1(Set<String> set) {
        System.out.println("---set集合先转数组，使用for循环进行遍历---");
        //使用for循环遍历set集合
        //set集合换成数组，对数组进行遍历
        Object[] objects = set.toArray();
        for (int i = 0; i < objects.length; i++) {
            Object s = objects[i];
            System.out.println(s);
        }
    }

}

