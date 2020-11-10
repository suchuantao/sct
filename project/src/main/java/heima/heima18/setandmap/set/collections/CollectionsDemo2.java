package heima.heima18.setandmap.set.collections;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/20 9:16
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * 发牌游戏
 */
public class CollectionsDemo2 {
    public static void main(String[] args) {
        //创建一幅派的集合
        ArrayList<String> box=new ArrayList<String>();
        //创建扑克牌的花色
        String [] hfmf={"🍑","♠","♣","♦"};
        //创建扑克牌的种类
        String [] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//添加每张牌到牌盒
        for (int i = 0; i <hfmf.length ; i++) {
            for (int j = 0; j <num.length ; j++) {
             box.add(hfmf[i]+num[j]);

            }
        }
        //添加大小王
        box.add("大王");
        box.add("小王");


        //洗牌 把牌的顺序打乱，每次都不一样
        Collections.shuffle(box);

        //发牌
         //创建三个人
        ArrayList<String > 苏兰=new ArrayList<String>();
        ArrayList<String> 周六福=new ArrayList<String>();
        ArrayList<String> 春燕 =new ArrayList<String>();

        for (int i = 0; i <box.size()-3 ; i++) {
            if(i%3==0){
                苏兰.add(box.get(i));
            }
            else if(i%3==1){
                周六福.add(box.get(i));
            }
            else if(i%3==2){
                春燕.add(box.get(i));
            }
        }

        System.out.println("苏兰:"+苏兰);
        System.out.println("周六福:"+周六福);
        System.out.println("春燕:"+春燕);
        //底牌
        System.out.println("底牌：");
        for (int i = box.size()-3; i <box.size() ; i++) {
            String  dipai=  box.get(i);
            System.out.println(dipai);
        }

    }
}
