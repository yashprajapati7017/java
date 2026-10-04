import java.util.*;
public class fansionGcd {
    public static void gcd(int num1,int num2){
        if(num1>num2){
            num1=num1-num2;
            
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        gcd(num1,num2);
        sc.close();
    }
}
