package Yash1;

public class Newclass2 {
    void f2(){
        System.out.println("hello newclass 2");
    }
    public static void main(String[] args){
        Newclass2 nc=new Newclass2();
        nc.f2();
        Newclass mc=new Newclass();
        mc.f1();
        mc.f2();
        mc.f3();
    }
}
