package heima.man;

public class MethTest7 {
    public static boolean compary(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean compary(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean compary(long a ,long b){
        System.out.println("long");
        return a==b;
    }
    public static boolean compary(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }

    public static void main(String[] args) {
        boolean f1=compary((byte) 3,(byte) 4);
        System.out.println(f1);

        boolean f2=compary((short) 32,(short) 34);
        System.out.println(f2);

        boolean f3=compary(20,20);
        System.out.println(f3);

         boolean f4=compary(20L,20L);
        System.out.println(f4);
    }
}
