package heima.man;

/*
 * 打印水仙花数
 * */
public class MethTest5 {
    public static void printfoler() {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        printfoler();
    }
}
