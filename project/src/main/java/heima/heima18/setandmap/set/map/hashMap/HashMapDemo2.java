package heima.heima18.setandmap.set.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/20 17:31
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        //创建对象
        HashMap<Student,String> studentStringHashMap=new HashMap<Student, String>();
        //创建key对象
        Student student1=new Student("张无忌","25");
        Student student2=new Student("赵敏","23");
        //添加映射关系
        studentStringHashMap.put(student1,"01");
        studentStringHashMap.put(student2,"02");

        //遍历方式1 获取所有key，通过key获取value
       Set<Student>  keys= studentStringHashMap.keySet();
        for (Student key:keys) {
            String values=studentStringHashMap.get(key);
            System.out.println(key+"---"+values);
        }

        //遍历方式二
        Set<Map.Entry<Student,String>> studentStringEntry=studentStringHashMap.entrySet();
        for (Map.Entry<Student,String> entry:studentStringEntry) {
           Student student=  entry.getKey();
           String values= entry.getValue();
            System.out.println(student+"---"+values);


        }
    }
}
