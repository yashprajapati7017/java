//with argument with return type
import java.util.*;
public class methodPart4 {
    public int calculate(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        methodPart4 mt= new methodPart4();
        mt.calculate(a,b);
        int add=mt.calculate(a,b);
        System.out.println(add);
        sc.close();
    }
}
