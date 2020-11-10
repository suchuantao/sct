package heima.heima17.arraylist.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/16 17:34
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加数据
        list.add(0, "java");
        list.add(1, "SQL");
        list.add(2, "Linux");
        list.add(3, "自动化");
      int i=  index(list,"Linux");
        System.out.println(i);

    }

    /**
     * 根据元素查找索引位置
     * @param list
     * @param object
     * @return
     */
    public static int index(List list, Object object) {

        for (int i = 0; i < list.size(); i++) {
            //获取列表中元素
            Object o = list.get(i);
            //判断元素列表是否又有该元素
            if (o.equals(object)) {
                return i;

            }
        }
        //如果没有就返回-1
        return -1;


    }
}


