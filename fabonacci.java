import java.util.*;
public class fabonacci{
    public static void fab(int num){
       int num1=0,num2=1;
       for(int i=1;i<=num;i++){
        System.out.println(num1);
        num1=num1+num2;
        num2=num1-num2;
       }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value");
        int num=sc.nextInt();
        fab(num); 
        sc.close();
    }
}