package heima.jinjie.array.object.rewrite.thisandsuper;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/9/29 17:52
 */
public class Zi extends Die{
    int num=30;
    public Zi(){
        //第一行不调用子类其他构造或父类构造，默认调用父类构造
        System.out.println("我是子类无参构造");
    }
    public Zi(int num){
        System.out.println("我是子类有参构造");
    }

    public void meth(){
        System.out.println("我是子类的方法");
    }
        /**
    　　* @Description: ${todo}
    　　* @param ${tags}
    　　* @return ${return_type}
    　　* @throws
    　　* @author suchuantao
    　　* @date 2020/9/29 18:01
    　　*/
    public void function(){
   //     this.num=50;
   //     System.out.println(num);
        //调用父类成员变量
        super.num=100;
        System.out.println(num);

    }
}
