import java.util.*;
public class funsionCheckNum {
    public static void check(int num){
        if(num%2==0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num");
        int num=sc.nextInt();
        check(num);
        sc.close();
    }
}
