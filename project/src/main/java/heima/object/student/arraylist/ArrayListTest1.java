package heima.object.student.arraylist;

import java.util.ArrayList;

/*
* arrayList<E>集合添加元素方法，并输出
* */
public class ArrayListTest1 {


    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> arrayList =new ArrayList<String>();
        //使用add()添加元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("哈哈");
        //使用add(int index,E element)指定索引进行元素添加
        arrayList.add(2,"我爱学习");
        //打印输出集合对象
        System.out.println(arrayList);

        System.out.println("使用toArray()把集合转换为数组");
        //把arrylist对象转换为数组
        Object[] objects=arrayList.toArray();
        //使用循环遍历数组
        for (int i = 0; i <objects.length ; i++) {
            String s= (String) objects[i];
            System.out.println(s);
        }

        System.out.println("使用public <T> T[] toArray(T[] a)方法，把arrayList转换为数组");
//使用public <T> T[] toArray(T[] a)方法，把arrayList转换为数组
        String [] aac = arrayList.toArray(new String[arrayList.size()] );
        //对转换后的数组进行遍历
        for (int i = 0; i <aac.length ; i++) {
         String s2=  aac[i];
         //输出
            System.out.println(s2);
        }


    }
}
