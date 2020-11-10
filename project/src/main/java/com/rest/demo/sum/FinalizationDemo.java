package com.rest.demo.sum;

public class FinalizationDemo {
    public static void main(String[] args) {
        Cake c1 = new Cake (1);
        Cake c2 = new Cake (2);
        Cake c3 = new Cake (3);
        c2 = c3;
        System.gc();//调用java垃圾回收器
    }
}
class Cake extends Object{
    private int id;
    public Cake (int id){
        this.id = id;
        System.out.println(id);
    }
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println(id);
    }

}
