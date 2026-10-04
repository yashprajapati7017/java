//without argument with returm type
import java.util.*;
public class methodPart2 {
    public int prints(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();
         sc.close();
        return (a+b);
    }
    public static void main(String[] args){
        methodPart2 cs=new methodPart2();
        int sum=cs.prints();
        System.out.println("sum are:-"+sum);
    }
}
