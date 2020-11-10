package heima.object.student.arraylist;

import java.util.ArrayList;

/*
 *
 * */
public class ArrayListTest4 {
    public static void main(String[] args) {
        //定义一个数组
        String[] strarry = {"张三丰", "宋远桥", "白眉鹰王", "张翠山", "张无忌", "莫声谷", "青翼蝠王", "金毛狮王", "紫衫龙王"};
        //创建一个集合
        ArrayList<String> stringArrayList = new ArrayList<String>();
        //遍历数组，拿到每一个元素
        for (int i = 0; i < strarry.length; i++) {
            //把数字中的元素添加到arraylist
            stringArrayList.add(strarry[i]);
        }
        //遍历集合
        for (int i = 0; i < stringArrayList.size(); i++) {
            String s = stringArrayList.get(i);

            //判断张姓开头以及以王结尾的的并输出
            if (s.startsWith("张")) {
                System.out.println(s);
            } else if (s.endsWith("王")) {
                System.out.println(s);
            }
        }
    }
}
