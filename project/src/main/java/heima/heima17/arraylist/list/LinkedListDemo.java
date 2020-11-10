package heima.heima17.arraylist.list;

import java.util.LinkedList;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/16 16:52
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建LinkedList对象
        LinkedList linkedList=new LinkedList();
        linkedList.add("紫衫龙王");
        linkedList.add("青翼蝠王");
        linkedList.add("金毛狮王");
        linkedList.add("白眉鹰王");
        System.out.println(linkedList);

        //将元素添加到索引为0的位置 void addFirst(E e)
        linkedList.addFirst("小招");
        System.out.println(linkedList);

        //将元素添加到size()-1的位置  void addLast(E e)
        linkedList.addLast("宋青书");
        System.out.println(linkedList);

        //返回列表的第一个元素 getFirst()
        Object o1= linkedList.getFirst();
        System.out.println(o1);

        //返回列表最后一个元素
        Object o2= linkedList.getLast();
        System.out.println(o2);

        //返回指定索引元素
        Object o3= linkedList.get(3);
        System.out.println(o3);

        //移除第一个元素并返回 E removeFirst()
        linkedList.removeFirst();
        System.out.println(linkedList);

        //移除最后一个元素并返回  E removeLast()
        linkedList.removeLast();
        System.out.println(linkedList);

        //返回元素个数 int size()
        int num= linkedList.size();
        System.out.println(num);

        // 返回以适当顺序（从第一个元素到最后一个元素）包含此列表中所有元素的数组 Object[] toArray()
       Object[] o4= linkedList.toArray();
        for (int i = 0; i <o4.length ; i++) {
        String  s= (String) o4[i];
            System.out.println(s);
        }






    }
}
