package heima.heima17.arraylist.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/16 15:57
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建列表
        List list=new ArrayList();
        //添加数据
        list.add(0,"java");
        list.add(1,"SQL");
        list.add(2,"Linux");
        list.add(3,"自动化");
        //遍历列表获取数据
        for (int i = 0; i <list.size() ; i++) {
            list.get(i);

        }
        System.out.println(list);


        //删除指定元素
         list.remove(3);
        System.out.println(list);

        //修改元素
         list.set(0,"大数据");
        System.out.println(list);

    }
}
