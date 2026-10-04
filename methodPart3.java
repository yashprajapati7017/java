// with argument without return type;
import java.util.*;
public class methodPart3{
    public void inputs(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();                                             //  sum of two no.
        methodPart3 cs=new methodPart3();
        cs.inputs(a,b);
        sc.close();
    }
}
    

