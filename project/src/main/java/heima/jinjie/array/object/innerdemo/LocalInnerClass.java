package heima.jinjie.array.object.innerdemo;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/13 10:07
 */

/**
 * 局部内部类
 *  在方法类，出了方法后就不能使用
 */

public class LocalInnerClass {
    public static void main(String[] args) {
        Over over=new Over();
        over.method();

    }
    static class Over{
        public void method(){
            class Inner{
                public void function(){
                    System.out.println("function");
                }
            }
            Inner inner=new Inner();
            inner.function();
        }

    }
}
