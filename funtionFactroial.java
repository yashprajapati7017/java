/*import java.util.*;
public class funtionFactroial{
    public static void fact(int a){
        int fac=1;
        for(int i=a;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of fact");
        int a=sc.nextInt();
        fact(a);
        sc.close();
    }
}*/
import java.util.*;
public class funtionFactroial{
    public static void fact(int fac){
        System.out.println(fac);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of fact");
        int a=sc.nextInt();
        int fac=1;
        for(int i=a;i>=1;i--){
            fac=fac*i;
        }
        fact(fac);
        sc.close();
    }
}
//both are correct