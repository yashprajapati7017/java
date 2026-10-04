import java.util.*;
public class recursion {
    public static void decress(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        decress(num-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int num=sc.nextInt();
        decress(num);
        sc.close();
    }
}
