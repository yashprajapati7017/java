/*
public class oppsQ {

    static void main(String[] args){
        System.out.println("hello");
    }
}
*/

// constructor 


/*import java.util.*;
public class oppsQ{
String name ;
int roll ;
float marks;
public oppsQ(String n,int rol,float m){
    name =n;
    roll =rol;
    marks=m;
}
void display(){
    System.out.println(name);
    System.out.println(roll);
    System.out.println(marks);
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name ");
    String n=sc.nextLine();
    System.out.println("roll no");
    int rol=sc.nextInt();
    System.out.println("enter the marks");
    float m=sc.nextFloat();
    oppsQ op=new oppsQ(n,rol,m);
    op.display();
}
}

*/


//defoult constructor anf parameterized constructor


/* 
class oppsQ{
    String name;
    int age;
    oppsQ(){
        name ="yash";
        age=19;
        System.out.println("parametrized constructor run");
        System.out.println("name "+name);
        System.out.println("age "+age);
    }
    oppsQ(int ag,String na){
        name=na;
        age=ag;
        System.out.println("defoult constructor run");
        System.out.println("name "+na);
        System.out.println("age "+ag);
    }
    public static void main(String[] args){
        oppsQ c =new oppsQ();
        int ag =10;
        String na="aayush";
        oppsQ s=new oppsQ(ag,na);
    }
}

*/

// demonstrate mathod overloading

/* 
class oppsQ{
    void f1(){
        System.out.println("f1 is runing");
    }
    void f1(int a){
        System.out.println("a value "+a);
    }
    void f1(int a,int b){
        int sum=a+b;
        System.out.println("sun of element "+sum);
    }
    void f1(int a,int b,int c){
        int mult=a*b*c;
        System.out.println("multiplay of element "+mult);
    }
    public static void main(String[] args){
        oppsQ opp=new oppsQ();
        opp.f1();
        opp.f1(20);
        opp.f1(20, 50);
        opp.f1(20, 2, 1);
    }

}

*/

//java program use keyword


/* 
class oppsQ{
    void f1(){
        System.out.println("f1 is runing");
    }
    void f2(){
        System.out.println("f2 is running");
    }
}
class opps extends oppsQ{
    void f3(){
        System.out.println("f3 is running");
    }
    void f4(){
        System.out.println("f4 is running");
    }
    public static void main(String[] args){
        opps op=new opps();
        op.f1();
        op.f2();
        op.f3();
        op.f4();
    }
}

*/

// calculate area od rectangle


/* 
class oppsQ{
    int x;
    int y;
    oppsQ(int a,int b){
        x=a;
        y=b;
        System.out.println("constructor");
    }
    void calculate(){
        int rec=x*y;
        System.out.println("calculate of rectangle "+rec);
    }
    public static void main(String[] args){
        oppsQ opp=new oppsQ(5,5);
        opp.calculate();
    }
}
    */

    // constructor class book
    
    /* 
    class oppsQ{
        String hindi ,english,maths;
        int hindiPrice,englishPrice,mathsPrice;
        oppsQ(String h,String e,String m,int hp,int ep,int mp){
            hindi=h;
            english=e;
            maths=m;
            hindiPrice=hp;
            englishPrice=ep;
            mathsPrice=mp;
        }
        void display(){
            System.out.println("hindi author "+hindi);
            System.out.println("hindi price "+hindiPrice);
            System.out.println("english author "+english);
            System.out.println("english price "+englishPrice);
            System.out.println("maths author "+maths);
            System.out.println("maths price "+mathsPrice);
        }
        public static void main(String[] args){
            String h="yash";
            String e="aayush";
            String m="aaunj";
            int hp=200;
            int ep=564;
            int mp=300;
            oppsQ opp=new oppsQ(h,e,m,hp,ep,mp);
            opp.display();
        }
    }

    */

    //demonstrate single inheritance

    /*
    class oppsQ{
        void animal(){
            System.out.println("animal");
        }
    }
    class dogs extends oppsQ{
        void dog(){
            System.out.println("dog is bark");
        }
    }
    class superclass {
        public static void main(String[] args){
            dogs d=new dogs();
            d.animal();
            d.dog();
        }
    }

    */

    