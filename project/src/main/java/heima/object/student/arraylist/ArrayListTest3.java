package heima.object.student.arraylist;

import java.util.ArrayList;

/*
* 集合遍历
* */
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Rich and noble");
        arrayList.add("我爱学习");
        arrayList.add("日落西山你不陪，东山再起你是谁");
        arrayList.add("你知道世界上最甜的水果是什么吗");
        arrayList.add("黑凤梨");

        //遍历集合元素
        for (int i = 0; i <arrayList.size() ; i++) {
            String result= arrayList.get(i);
            System.out.println(result);
        }
    }
}
