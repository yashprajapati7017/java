class o {
    void animal(){
        System.out.println("animals");
        System.out.println("animal class run");
    }
}
class dog extends o{
    void f1(){
        System.out.println("barking");
        System.out.println("dog class run");
    }
}
class cat extends dog{
    void f2(){
        System.out.println("miwww");
        System.out.println("cat class run");
    }
}
public class Display extends cat{
    void f3(){
        System.out.println("dislay method is running");
    }
    public static void main(String[] args){
        Display d=new Display();
        d.animal();
        d.f1();
        d.f2();
        d.f3();
    }
}