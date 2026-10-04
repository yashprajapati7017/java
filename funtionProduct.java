import java.util.*;
public class funtionProduct {
    public static void product(int a,int b){
        int multiplay=a*b;
        System.out.println(multiplay);
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value a");
        int a=sc.nextInt();
        System.out.println("enter the value b");
        int b =sc.nextInt();
        product(a,b);
        sc.close();
    
    }
}