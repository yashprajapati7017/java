interface a{
    void f1();
    void f2();
    void f3();
}
public class abstraction implements a{

    @Override
    public void f1() {
        // TODO Auto-generated method stub
        System.out.println("hello");
        //throw new UnsupportedOperationException("Unimplemented method 'f1'");
    }

    @Override
    public void f2() {
        // TODO Auto-generated method stub
        System.out.println("yash");
        //throw new UnsupportedOperationException("Unimplemented method 'f2'");
    }

    @Override
    public void f3() {
        // TODO Auto-generated method stub
        System.out.println("prajapati");
        //throw new UnsupportedOperationException("Unimplemented method 'f3'");
    }
    public static void main(String[] args){
        abstraction ab=new abstraction();
        ab.f1();
        ab.f2();
        ab.f3();
    }

    public void getDelail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDelail'");
    }

}

    
