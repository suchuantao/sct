package heima.jinjie.array.object.rewrite.thisandsuper;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/9/29 17:49
 */
public class Die {
    int num=10;
    public Die(){
        System.out.println("我是父类无参构造");
    }
    public Die(int num){
        System.out.println("我是父类有参数构造" );

    }

    public void meth(){
        System.out.println("我是父类的方法");
    }
}
