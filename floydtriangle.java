//rong program
import java.util.*;
public class floydtriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                sum=sum+j;
                 System.out.print( sum );
            }
            System.out.println();
        }
        sc.close();
    }
    }


