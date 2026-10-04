import java.util.*;
public class recursionFactorial {
    public static void calculateFact(int num,int fac){
        if(num==1){
            fac=num*fac;
            System.out.println(fac);
            return;            
        }
        fac=num*fac;
        calculateFact(num-1,fac);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num.");
        int num=sc.nextInt();
        int fac=1;
        calculateFact(num,fac);
        sc.close();
    }
}
