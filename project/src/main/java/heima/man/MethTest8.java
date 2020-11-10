package heima.man;
/*如果方法的参数是基本数据类型：
      形参的改变不影响实际参数
*
* */
public class MethTest8 {
    public static void main(String[] args) {
        int a=10;//实参
        int b=20;//实参
        System.out.println("1 "+"a的值为："+a+"   b的值为:"+b);
        chengji(a,b);
        System.out.println("4 "+"a的值为："+a+"   b的值为:"+b);
    }
    public static void chengji(int a,int b){//形参
        System.out.println("2 "+"a的值为："+a+"   b的值为:"+b);
        a=b;
        b=a+b;
        System.out.println("3 "+"a的值为："+a+"   b的值为:"+b);

    }
}
