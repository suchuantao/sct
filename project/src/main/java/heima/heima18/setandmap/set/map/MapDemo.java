package heima.heima18.setandmap.set.map;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/20 10:33
 */

import java.util.*;

/**
 * 需求：实现学号跟姓名这样的有对应关系的数据
 * Map:将键映射到值的对象，一个映射 不能包含重复的键，每个键只能映射一个值。
 * Map与Conllection 区别：
 * Map:是一个双列集合，有对应关系，key不可重复
 * Collection:是一个单列集合，有不同的子体系，有允许重复的索引也有不可重复的索引
 * <p>
 * Map功能
 * 判断功能：boolean containsKey(Object key)  如果此映射包含指定键的映射关系，则返回 true。
 * boolean containsValue(Object value) 如果此映射将一个或多个键映射到指定值，则返回 true。
 * boolean isEmpty()  如果此映射未包含键-值映射关系，则返回 true。
 * 删除：void clear()
 * V remove(Object key) 如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 * 遍历：Set<Map.Entry<K,V>> entrySet()  返回此映射中包含的映射关系的 Set 视图。
 * 获取功能：V get(Object key)  返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
 * int size() 返回此映射中的键-值映射关系数。
 * 映射（添加或者修改）  V put(K key, V value)  将指定的值与此映射中的指定键关联（可选操作）。
 */
public class MapDemo {
    public static void main(String[] args) {
        method1();


        //判断指定的key是否存在
        //创建map对象
        // V put(K key, V value)就是将key的值映射到vaLue,如果key存在，则覆盖value,并将原来的value返回
        Map<String, String> map = new HashMap<String, String>();
        //添加
        map.put("001", "张无忌");
        map.put("002", "赵敏");
        map.put("003", "俞岱岩");
        //判断指定的key是否存在
        boolean key = map.containsKey("001");
        System.out.println("判断指定的key是否存在：" + key);
        //判断指定的value是否存在
        boolean value = map.containsValue("俞岱岩");
        System.out.println("判断指定的value是否存在：" + value);
        //判断是否有对应关系，有则返回false
        boolean is = map.isEmpty();
        System.out.println(is);
        //清空map里面的数据
//        map.clear();
//        System.out.println(map);

        //删除指定的key,返回value值,没有删除成功返回null
        //V remove(Object key)
        String remore = map.remove("003");
        System.out.println(remore);
        System.out.println(map);
        //获取map对象的长度
        int size = map.size();
        System.out.println(size);
        //根据key查找，返回value，如果查不到返回null
        String get = map.get("002");
        System.out.println(get);

        method2(map);
        method3(map);
        method4(map);

    }

    /**
     * 使用 Set<Map.Entry<K,V>> entrySet() 遍历Map集合中的key，value
     *
     * @param map
     */
    public static void method4(Map<String, String> map) {
        //  Set<Map.Entry<K,V>> entrySet()
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            String getkey = entry.getKey();
            String getvalue = entry.getValue();
            System.out.println(getkey + "," + getvalue);
        }
    }

    /**
     * 使用Collection<V> values()遍历Map集合中的value值，使用增强for循环
     *
     * @param map
     */
    public static void method3(Map<String, String> map) {
        //Collection<V> values()
        Collection<String> values = map.values();
        for (String vaule : values) {
            System.out.println("遍历Map中的value值:" + vaule);
        }
    }

    /**
     * 遍历map集合里面的key
     * 以Set的形式返回所有的key
     *
     * @param map
     */
    public static void method2(Map<String, String> map) {
        //Set<K> keySet()
        //返回此映射中包含的键的 Set 视图
        Set<String> keys = map.keySet();
        //把Set转换成数组
        Object[] objects = keys.toArray();
        //遍历数组
        for (int i = 0; i < objects.length; i++) {
            Object s = objects[i];
            System.out.println("遍历Map中的key值:" + s);
        }
    }

    /**
     * 添加或修改Map元素的方法
     */
    public static void method1() {
        //创建map对象
        // V put(K key, V value)就是将key的值映射到vaLue,如果key存在，则覆盖value,并将原来的value返回
        Map<String, String> map = new HashMap<String, String>();
        //添加
        map.put("001", "张无忌");
        map.put("002", "赵敏");
        map.put("003", "俞岱岩");
        map.put("001", "金毛狮王~谢逊");//当key存在时，在添加相同的key，可以修改v的值
        System.out.println(map);
    }

}
