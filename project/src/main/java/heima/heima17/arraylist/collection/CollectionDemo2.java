package heima.heima17.arraylist.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/15 11:37
 */

/**
 * 需求：判断集合中是否有java元素，如果有则需要添加android
 */

public class CollectionDemo2 {
    public static void main(String[] args) {
      //  method1();
        listItertor();

    }

    /**
     * 使用ListIterator 添加集合元素
     *
     */
    public static void listItertor() {
        //创建集合对象
        ArrayList arrayList = new ArrayList();
        //添加元素
        arrayList.add("hellow");
        arrayList.add("world");
        arrayList.add("java");
        //我们可以通过遍历获取集合中的每一个元素，然后进行比较即可
        ListIterator listIterator= arrayList.listIterator();
        while (listIterator.hasNext()){
         String s= (String) listIterator.next();
         if(s.equals("java")){
             listIterator.add("android");

         }

        }

        System.out.println(arrayList);
    }

    /**
     * 判断集合中是否有java元素，如果有则需要添加android
     * //使用collection.contains()判断集合元素是否有该元素
     */
    public static void method1() {
        //创建集合对象
        Collection collection = new ArrayList();
        //添加元素
        ((ArrayList) collection).add("hellow");
        ((ArrayList) collection).add("world");
        ((ArrayList) collection).add("java");
        //使用collection.contains()判断集合元素是否有该元素
        if (collection.contains("java")) {
            ((ArrayList) collection).add("android");
        }
        System.out.println(collection);
    }
}
