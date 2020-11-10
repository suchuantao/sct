package heima.heima18.setandmap.set.map.hashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/20 16:15
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap对象
        HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
        //添加数据
        hashMap.put(1,"朱标");
        hashMap.put(2,"朱樉");
        hashMap.put(3,"朱棡");
        hashMap.put(3,"朱棣");
        hashMap.put(5,"朱橚");
        hashMap.put(6,"朱桢");
        hashMap.put(7,"朱榑");
        hashMap.put(8,"朱梓");
        hashMap.put(9,"朱杞");
        hashMap.put(10,"朱檀");
        hashMap.put(11,"朱椿");
        hashMap.put(12,"朱柏");
        hashMap.put(13,"朱桂");
        hashMap.put(14,"朱楧");
        hashMap.put(15,"朱植");
        hashMap.put(16,"朱栴");
        hashMap.put(17,"朱权");
        hashMap.put(18,"朱楩");
        hashMap.put(19,"朱橞");
        hashMap.put(20,"朱松");
        hashMap.put(21,"朱模");
        hashMap.put(22,"朱楹");
        hashMap.put(23,"朱桱");
        hashMap.put(24,"朱栋");

        //遍历Map
         //方式一 获取所有key，通过key来获取value
        Set<Integer> keys=hashMap.keySet();
        for (Integer key:keys) {
            String values=  hashMap.get(key);
            System.out.println(key+"---"+values);

        }







    }
}
