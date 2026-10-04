
interface a{
    void f1();
    void f2();
}

public class abstractionQ implements a {

    @Override
    public void f1() {
        System.out.println("yash");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'f1'");
    }

    @Override
    public void f2() {
        System.out.println("yash");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'f2'");
    }
    public static void main(String[] args){
        abstractionQ aq=new abstractionQ();
        aq.f1();
        aq.f2();
    }
    
}



/* 
interface student {
    void getDelail();
}
        
 public class abstractionQ implements student {

    @Override
    public void getDelail() {
        System.out.println("student name yash");
        System.out.println("student roll no. 101");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getDelail'");
    }

 }
 class college implements student{

    @Override
    public void getDelail() {
        // TODO Auto-generated method stub
        System.out.println("student name aayush ");
        System.out.println("student roll no. 102");
        //throw new UnsupportedOperationException("Unimplemented method 'getDelail'");
    }
    public static void main(String[] args){
        abstractionQ aq=new abstractionQ();
        aq.getDelail();
        college co=new college();
        co.getDelail();
    }

 }
*/

/* 
interface printable{
    void sum(int a,int b);
    void mult(int a,int b);
}
interface showable{
    void f1();
    void f2();
}
public class abstractionQ implements printable,showable{

    @Override
    public void f1() {
        System.out.println("sum of element:-");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'f1'");
    }

    @Override
    public void f2() {
        System.out.println("multiplay of element:-");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'f2'");
    }

    @Override
    public void sum(int a, int b) {
        int add=a+b;
        System.out.println(add);
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    public void mult(int a, int b) {
        int m=a*b;
        System.out.println(m);
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mult'");
    }
    public static void main(String[] args){
        abstractionQ aq=new abstractionQ();
        aq.f1();
        aq.sum(25, 25);
        aq.f2();
        aq.mult(5, 2);
    }

}
*/

/* 
interface a{
    void method1();
}
interface b extends a{
    void method2();
}
public class abstractionQ implements b{

    @Override
    public void method1() {
        System.out.println("method 1 implement abstractionQ");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'method1'");
    }

    @Override
    public void method2() {
        System.out.println("method 2 implement abstractionQ");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'method2'");
    }
    public static void main(String[] args){
        abstractionQ aq=new abstractionQ();
        aq.method1();
        aq.method2();
    }

}
*/


/* 
interface payment{
    void pay(long amount);
}
public class abstractionQ implements payment{

    @Override
    public void pay(long amount) {
        System.out.println("payment of "+ amount+" using gogole");
        // TODO Auto-generated method stub
     //   throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

}
class upi implements payment {

    @Override
    public void pay(long amount) {
        // TODO Auto-generated method stub
        System.out.println("payment of "+amount+" using upi");
      //  throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
    public static void main(String[] args){
        abstractionQ aq=new abstractionQ();
        aq.pay(250000);
        upi up=new upi();
        up.pay(52000);
    }

}

*/