package heima.heima17.arraylist.collection;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/15 9:38
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection
 *  boolean add(E e)  添加元素
 *  void clear()     清除元素
 *   boolean contains(Collection)   如果此 collection 包含指定的元素，则返回 true。
 *
 *  boolean isEmpty()  是否包含元素，不包含返回true
 *  boolean remove(Object o)  移除元素
 *  int size() 返回元素个数
 *  Object[] toArray()  返回Collection中元素数组
 *
 *  集合的遍历方式：
 *      1，toArray() 可以把集合转换成数组，然后遍历数组即可
 *      2，iterator() 可以返回一个迭代器对象，我们可以通过迭代器来迭代对象
 *           E next()  返回迭代的下一个元素
 *
 *
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        add();
        clear();
        isEmpty();
        contains();
        remove();
        size();
        collectionToarray();
        iterator();


    }

    /**
     * 使用Iterator迭代器遍历集合元素
     */
    public static void iterator() {
        //遍历集合
        System.out.println("迭代器遍历集合元素");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");
        //获取迭代器对象
        Iterator iterator=collection.iterator();
        //使用while循环遍历
        //boolean hasNext:判断是否有迭代元素可获取，如果有返回true
        while (iterator.hasNext()){
            //iterator.next()返回下一个元素
            Object object= iterator.next();
            System.out.println();
        }

        //输出collection
        System.out.println(collection);
    }

    /**
     * collection集合转换成数组
     */
    public static void collectionToarray() {
        System.out.println("将集合转换成数组");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");
       // collection集合转换成数组
        Object objects []=collection.toArray();
        //遍历
        for (int i = 0; i <objects.length ; i++) {
          Object object=  objects[i];
            System.out.println(object);
        }
    }

    /**
     * 返回元素个数
     */
    public static void size() {
        System.out.println("返回元素个数集合元素");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");
        int number= collection.size();
        System.out.println(number);
        //输出collection
        System.out.println(collection);
    }

    public static void remove() {
        System.out.println("删除集合元素");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");
        boolean b5=  collection.remove("黑马");
        System.out.println(b5);
        //输出collection
        System.out.println(collection);
    }

    /**
     * 判断是否包含指定元素，包含返回true
     */
    public static void contains() {
        System.out.println("判断是否包含指定元素，包含返回true");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");

        boolean b4=  collection.contains("黑马");
        System.out.println(b4);
        //输出collection
        System.out.println(collection);
    }

    /**
     * 判断集合中是否为空，为空返回true
     */
    public static void isEmpty() {
        System.out.println("判断集合中是否为空，为空返回true");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");
        // boolean isEmpty()  是否包含元素，不包含返回true
        boolean b3=  collection.isEmpty();
        System.out.println(b3);
        //输出collection
        System.out.println(collection);
    }

    /**
     * 清空集合元素
     */
    public static void clear() {
        System.out.println("清空集合元素");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");
        //void clear()     清除元素
        collection.clear();
        //输出collection
        System.out.println(collection);
    }

    /**
     * 添加集合元素
     */
    public static void add() {
        System.out.println("添加集合元素");
        //创建集合对象
        //因为Collection是一个接口，所以不能被实例化，
        //父类引用指向子类对象
        Collection collection=new ArrayList();
        // boolean add(E e)  添加元素
        boolean b1= ((ArrayList) collection).add("哈哈");//ArrayList添加永远都是添加成功，内容可重复
        boolean b2= ((ArrayList) collection).add("黑马");
        //返回true 说明添加成功
        System.out.println(b1);
        System.out.println(b2);
        //输出collection
        System.out.println(collection);

    }
}
