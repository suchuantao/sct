package heima.jinjie.array.object.innerdemo;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/12 17:40
 */

import heima.jinjie.array.object.innerdemo.InnerDemo.Outer.Inner;

/**
 * 成员内部类
 *  在类的成员位置，和成员变量以及成员方法所在位置是一样的
 *  在内部类中，可以直接访问外部类的成员，包括私有成员
 */
public class InnerDemo {
    public static void main(String[] args) {
        Inner i =new Outer().new Inner();
        i.function();
    }

    static class Outer{
        private int num=10;
        public void method(){
            Inner i=new Inner();
            i.function();

        }
        class Inner{
            public void function(){
                System.out.println(num);
            }
        }
    }

}
