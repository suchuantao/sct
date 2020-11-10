package heima.string;

public class StringTest1 {
    public static void main(String[] args) {
        String s1=new String("hellow");
        System.out.println("s1:"+s1);
        String s2="hellow";
        System.out.println("s2:"+s2);
        String s3="hellow";
        System.out.println("s3:"+s3);

        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s1==s3:"+(s1==s3));
        System.out.println("s2==s3:"+(s2==s3));
    }
}
