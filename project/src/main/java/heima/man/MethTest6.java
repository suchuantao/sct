package heima.man;
/*
* 重载:在同一个类中，方法名相同，参数个数相同时参数类型不能相同，参数个数不同时参数类型可相同
* */
public class MethTest6 {
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static int sum(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    public static double sum(double a,double b){
        double f=a+b;
        return f;
    }

    public static void main(String[] args) {
        int d=sum(23,34);
        System.out.println(d);
        int d1=sum(23,55,66);
        System.out.println(d1);
        double f=sum(23.3,223.5);
        System.out.println(f);
    }


}
