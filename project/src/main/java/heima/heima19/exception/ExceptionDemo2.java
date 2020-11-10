package heima.heima19.exception;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/21 17:14
 */

/**
 * Throwable的常用方法
 *  String getMessage() 返回此 throwable 的详细消息字符串。
 *  String toString() 返回此 throwable 的简短描述
 *  void printStackTrace() 将此 throwable 及其追踪输出至标准错误流
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int a=2/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //获取异常信息的原因类型位置
            e.printStackTrace();
            //获取异常的原因
            String getMessage=  e.getMessage();
            //获取异常的类型
            String tostrng= e.toString();
            System.out.println(getMessage);
            System.out.println(tostrng);
        }
    }
}
