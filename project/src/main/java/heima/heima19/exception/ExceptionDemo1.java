package heima.heima19.exception;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/21 10:51
 */

import java.io.FileWriter;
import java.io.IOException;

/**
 * 我们在写代码的时候，经常会出现一些小问题，为了方便处理这些问题，java为我们提供了异常机制
 *  异常包含了错误的类型，原因以及位置
 *  异常：不正常，我们的代码在运行时或编译的错误
 *  异常的体系结构
 *      Throwable(最顶层)
 *      Error：出现的不能够解决的严重问题
 *      Exception:可以处理的一些问题
 *  异常的处理方式
 *
 *  try{
 *
 *  }catch(){
 *
 *  }
 *  首先执行try语句
 *      如果发现异常，异常下面的代码不在执行，直接跳入到catch语句中，catc语句结束后 整个try...catch 结束
 *      如果没发现异常 try语句执行结束后  ，直接结束，不执行catch语句
 *
 *  jvm处理方式：
 *      如果出现异常我们没有处理，jvm会帮我们处理，他会把异常的类型原因还有位置显示在命令行上，并且终止程序，异常后的代码不执行
 *
 *  抛出异常
 *      当我们不想处理异常或者没能力解决的时候，我们可以选择抛出异常，谁调用方法谁处理
 *      使用关键字throws在方法 声明是抛出
 *
 *  如何处理多个异常
 *      可以使用多个try catch语句
 *      使用一个try和多个catch语句
 *    多个catch之间的顺序
 *      多个catch可以有子父类
 *      平级之间没有顺序关系
 *      如果有子父类，父类异常必须放在最后
 */
public class ExceptionDemo1 {
    public static void main(String[] args) throws IOException{
        method1();

        method2();

    }

    public static void method2() throws IOException {
        FileWriter fileWriter=new FileWriter("a.txt");
    }

    public static void method1() {
        try {
            int a=2/0;
            System.out.println(a);
        } catch (Exception e) {

            System.out.println("除数不能为0");
        }
    }
}
