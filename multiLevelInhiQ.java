/*class person{
    int age;
    String name;
    void f1(){
        System.out.println("name of person "+ name);
        System.out.println("age of person "+age);
    }
}
class student extends person{
    int roll;
    String cource;
    void f2(){
        System.out.println("roll number of person "+roll);
        System.out.println("cource of person "+cource);
    }
}
class exam extends student{
    int marks ;
    void f3(){
        System.out.println("studebt marks "+marks);
    }
}
public class multiLevelInhiQ {
  public static void main(String[] args ){
    exam ex=new exam();
    ex.age=19;
    ex.name="yash";
    ex.roll=101;
    ex.cource="bsc";
    ex.marks=60;
    ex.f1();
    ex.f2();
    ex.f3();
  }  
}

*/



/* 
class vehical{
    void start(){
        System.out.println("car start 0");
        System.out.println("car end 350");
    }
}
class car extends vehical{
    void f1(){
        System.out.println("1 gear ---45km/h");
        System.out.println("2 gera ---100kh/h");
        System.out.println("3 gera ---160km/h");
        System.out.println("4 gear ---220km/h");
        System.out.println("5 gear ---350km/h");
    }
} 
class sport extends car{
    void f2(){
        System.out.println("1 gear ---90km/h");
        System.out.println("2 gear ---200km/h");
        System.out.println("3 gear ---350km/h");
        System.out.println("4 gear ---500km/h");
        System.out.println("5 gear ---650km/h");
    }
}
class multiLevelInhiQ extends sport{
    public static void main(String[] args){
        sport sp=new sport();
        sp.start();
        sp.f1();
        sp.f2();
    }
}


*/



class employ {
    String name;
    void f1(){
        System.out.println("name of employee "+name);
    }
}
class manager extends employ{
    int salary;
    String department;
    void f2(){
        System.out.println("depart of employee "+department);
        System.out.println("salart of employee "+salary);
    }
}
class project extends manager{
    int size;
    void f3(){
        System.out.println("size of employee "+size);
    }
}
class multiLevelInhiQ extends project{
    public static void main(String[] args){
        project pr=new project();
        pr.name="yash";
        pr.salary=2500;
        pr.department="bcs";
        pr.size=10;
        pr.f1();
        pr.f2();
        pr.f3();
    }
}

