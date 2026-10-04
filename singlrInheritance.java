/*class person{
    int age ;
    String name;
    void display(){
        System.out.println("name of person "+name);
        System.out.println("age of person "+age);
    }
}
class student extends person{
        int roll;
        int marks;
        void f2(){
            System.out.println("strudent roll "+roll);
            System.out.println("strudent marks "+marks);
        }

    }
public class singlrInheritance {
    public static void main(String[] args){
        student cs=new student();
        cs.age=19;
        cs.name="yash";
        cs.roll=101;
        cs.marks =424;
        cs.display();
        cs.f2();
    }
}

*/

/* 

class vecical{
    int speed ;
    vecical(){
        speed =0;
    }
    void f1(int increment){
        speed+=increment;
        System.out.println("current speed "+speed+" km/h");
    }
}
class car extends vecical {
    void f2(int decrement){
        speed-=decrement;
        if(speed<0){
            speed=0;
        }
        System.out.println("decrease speed "+speed+" km/h");
    }
}
public class singlrInheritance{
    public static void main(String[] args){
        car c=new car();
        c.f1(50);
        c.f1(40);
        c.f2(30);
        c.f2(20);
    }
}

*/


/* 
class shape{
    void area(){
        System.out.println("area is depend on shape ");
    }
}
class rectangle extends shape{
    int length;
    int breath;
    rectangle(int l,int b){
        length=l;
        breath=b;
    }
    void f2(){
        int rec=length*breath;
        System.out.println("aresa of rectangle "+rec);
    }
}
public class singlrInheritance{
    public static void main(String[] args){
        rectangle rt=new rectangle(25,4);
        rt.area();
        rt.f2();

    }
}
*/


/* 
class employee{
    String name;
    int salary;
}
class manager extends employee{
    String department;
    void f1(){
        System.out.println("name of employee "+name);
        System.out.println("salary of employee "+salary);
        System.out.println("department of employee "+department);
    } 
}
public class singlrInheritance{
    public static void main(String[] args){
        manager mg=new manager();
        mg.name="yash";
        mg.salary=50000;
        mg.department="bcs";
        mg.f1();
    }
}

*/



/* 
class bank{
    int ammount;
    void f1(){
        System.out.println("ammount of your account "+ammount);
    }
}
class sbi extends bank{
    void f2(){
        System.out.println("intersect of 6% "+(ammount *6)/100);
    }
}
class icici extends bank{
    void f3(){
        System.out.println("intersect of 7% "+(ammount*7)/100 );
    }
}
public class singlrInheritance{
    public static void main(String[] args){
        icici ic=new icici();
        ic.ammount=1500;
        ic.f1();
        ic.f3();
        sbi bi=new sbi();
        bi.ammount=1500;
        bi.f1();
        bi.f2();
    }
}
*/



class parents {
    parents(){
        System.out.println("parents class constructor");
    }
}
class child extends parents{
    child (){
        System.out.println("child class constructor");
    }
}
class singlrInheritance{
    public static void main(String[] args){
        child ch=new child();
        parents pr=new parents();
    }
}