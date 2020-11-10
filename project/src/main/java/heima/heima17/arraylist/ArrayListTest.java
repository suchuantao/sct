package heima.heima17.arraylist;

import java.util.ArrayList;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/15 9:24
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList arrayList=new ArrayList();
        //添加元素
        arrayList.add(12);
        arrayList.add("还吗");
        arrayList.add("黑马");
        arrayList.add("嘿嘿");
        arrayList.add(4);
        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
         Object  result=   arrayList.get(i);
            System.out.println(result);

        }
    }
}
