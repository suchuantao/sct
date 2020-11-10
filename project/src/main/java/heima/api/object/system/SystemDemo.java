package heima.api.object.system;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/13 16:52
 */

/**
 * system 包含一些有用的类和方法，不能被实例化
 *  static void arraycopy(object src,int srcPos,Object dest,int desPos,int length)
 *  static void exit(int status)
 *  static void gc
 */
public class SystemDemo {
    public static void main(String[] args) {
        method();
        method2();

        method3();

        //垃圾回收
        System.gc();


    }

    /**
     * 当i=100,程序退出
     */
    public static void method3() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(i);
            if(i==100){
              System.exit(0);
            }

        }
    }

    public static void method2() {
        //返回当前系统时间
        long s=  System.currentTimeMillis();
        System.out.println(s);
        long start=System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("执行10000次for循环耗时："+(end-start));
    }

    public static void method() {
        /**
         * static void arraycopy(object src,int srcPos,Object dest,int desPos,int length)
         * 复制数组
         * 参数1：源数组
         * 参数2：源数组的起始索引位置
         * 参数3：目标数组
         * 参数4：目标数组的起始索引位置
         * 参数5：指定接收元素个数
         */
        int [] num={1,2,3,4,5,6,7,8,9};
        int [] l=new int[9];
        System.arraycopy(num,2,l,4,5);
        for (int i = 0; i <num.length ; i++) {
            System.out.print(l[i]);
        }
    }
}
