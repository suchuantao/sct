package heima.heima18.setandmap.set.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/19 16:03
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();

    }

    /**
     * 在指定列表的指定位置处交换元素
     */
    public static void method5() {
        List<String> list=new ArrayList<String>();
        list.add("金毛狮王");
        list.add("青翼蝠王");
        list.add("紫衫龙王");
        list.add("白眉鹰王");
        list.add("金轮法王");
        Collections.swap(list,2,4);
        System.out.println(list);
    }

    /**
     * 使用默认随机源对指定列表进行置换
     */
    public static void method4() {
        List<String> list=new ArrayList<String>();
        list.add("金毛狮王");
        list.add("青翼蝠王");
        list.add("紫衫龙王");
        list.add("白眉鹰王");
        list.add("金轮法王");
        Collections.shuffle(list);
        System.out.println(list);
    }

    /**
     * 返回指定源列表中第一次出现指定目标列表的起始位置；如果没有出现这样的列表，则返回 -1
     */
    public static void method3() {
        List<String> list=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        list.add("金毛狮王");
        list.add("青翼蝠王");
        list.add("紫衫龙王");
        list.add("白眉鹰王");
        list.add("金轮法王");
        list2.add("白眉鹰王");
        list2.add("金轮法王");
        int index=  Collections.indexOfSubList(list,list2);
        System.out.println(index);
    }

    /**
     * 用指定元素替换指定列表中的所有元素
     */
    public static void method2() {
        List<String> list=new ArrayList<String>();
        list.add("金毛狮王");
        list.add("青翼蝠王");
        list.add("紫衫龙王");
        list.add("白眉鹰王");
        list.add("金轮法王");
        Collections.fill(list,"ha");
        System.out.println(list);
    }

    /**
     * 将所有指定元素添加到指定 collection 中
     */
    public static void method1() {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        Collections.addAll(list);
        System.out.println(list);
    }




}
