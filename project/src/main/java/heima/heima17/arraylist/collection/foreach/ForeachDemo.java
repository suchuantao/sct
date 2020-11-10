package heima.heima17.arraylist.collection.foreach;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/16 14:36
 */

/**
 * foreach 增强for循环 一般用于遍历集合或者数组
 * 格式
 * for(元素变量类型 ：集合或者数组对象)｛
 * 可以直接使用对象
 * ｝
 * 注意：在增强for循环中不能修改集合，否则会出现并发修改异常
 * public interface Iterable<T>
 * 实现这个接口对象成为“foreach”语句目标
 */
public class ForeachDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> collection = new ArrayList<String>();
        //向集合中添加元素
        ((ArrayList<String>) collection).add("哈哈哈");
        ((ArrayList<String>) collection).add("紫衫龙王");
        ((ArrayList<String>) collection).add("青翼蝠王");
        ((ArrayList<String>) collection).add("白眉鹰王");
        ((ArrayList<String>) collection).add("金毛狮王");
        //使用foreach循环遍历
        for (String string:collection) {
            System.out.println(string);
        }
//        //方法二 用while循环遍历
//        Iterator iterator=collection.iterator();
//        while (iterator.hasNext()){
//         String s= (String) iterator.next();
//            System.out.println(s);
//        }



    }
}

