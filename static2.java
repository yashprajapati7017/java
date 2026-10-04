public class static2 {
    static int a,b;
    static{
        System.out.println("static block is running");
    }
    static {
        a=5;
        b=25;
    }
    static void display(){
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    public static void main(String[] args){
        static2 st=new static2();
        st.display();
    }
}
