public class static1 {
    static int b=5;
    static void f1(){
        System.out.println("hello \nstatic funtion is running ");
    }
    void f2(){  
            System.out.println(b+"f2 is running");
    }
    void f3(){
            System.out.println("f3 is runing");
    }
    public static void main(String[] args){
        static1 st=new static1();
        f1();
        st.f2();
        st.f3();
        
        }
}
