package heima.man;
/*
* 方法：完成特定功能的代码块
*
* */
public class Method {

    //求和
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        //赋值调用
        int result=sum(12,33);
        System.out.println(result);
    }
}

