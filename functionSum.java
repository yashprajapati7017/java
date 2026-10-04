import java .util.*;
public class functionSum {
    public static void calculateSum(int a,int b){
        int add =a+b;
        System.out.println(add);
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value a");
        int a =sc.nextInt();
        System.out.println("enter the value b");
        int b =sc.nextInt();
        calculateSum(a, b);
        sc.close();
    }
}
