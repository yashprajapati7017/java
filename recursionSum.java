//sum of all natural no.

import java.util.*;
public class recursionSum {
    public static void printSum(int i,int num,int sum){
        if(num==i){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, num, sum);
    }   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the last num");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        printSum(i,num,sum);
        sc.close();
    }
}
