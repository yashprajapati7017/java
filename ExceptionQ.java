
//exception handli
/* 
public class ExceptionQ{
    public static void main(String[] args){
        try{
            int d=0,a=4;
            int divi=a/d;
            System.out.println(divi);
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
}

*/

//throw keyward

class  ExceptionQ{
   static void f1(){
    try{
        throw new NullPointerException ("demo");
    }
    catch(Exception e){
        System.out.println("catch id running");
        throw e;
    }
}
    public static void main(String [] args){
        try{
            f1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

