package heima.object.student.arraylist;

import java.util.ArrayList;

/*
 * 对arrayList数组元素增删改查
 *  获取数组元素：
 *  pubulic E get (int index);返回指定元素的索引
 *  集合长度
 *  public int size():返回集合中元素的个数
 *  删除元素
 *  public boolean remove (objict o );删除指定元素，返回是否成功
 *  public E remove(int index) 删除指定索引的元素，返回被删除的元素
 *  修改元素
 *  public E set(int index,E element);修改指定索引的元素，返回被修改的元素
 * */
public class AaaryListTest2 {
    public static void main(String[] args) {
        //创建一个对象
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Rich and noble");
        arrayList.add("我爱学习");
        arrayList.add("日落西山你不陪，东山再起你是谁");
        arrayList.add("你知道世界上最甜的水果是什么吗");
        arrayList.add("黑凤梨");
  //      System.out.println(arrayList);
//
//        //获取指定索引
//        String index = arrayList.get(2);
//        System.out.println(index);
//
//        //返回集合中元素的个数
//        int number = arrayList.size();
//        System.out.println(number);
//
//        //删除指定元素并返回
//        boolean b = arrayList.remove("我爱学习");
//        System.out.println(b);
//
//        //删除指定元素索引并返回该元素
//        String delect = arrayList.remove(0);
//        System.out.println(delect);

        //修改指定索引的元素，并返回
        String result=  arrayList.set(1,"我不爱学习");
        System.out.println(result);





         System.out.println(arrayList);
    }
}
