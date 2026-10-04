import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no =sc.nextInt();
        int copy=no;
        int arm=0;
        int rev=0;
        rev=no%10;
        arm+=rev*rev*rev;
        no=no/10;
        rev=no%10;
        arm+=rev*rev*rev;
        no=no/10;
        rev=no%10;
        arm+=rev*rev*rev;
        if(arm == copy){
            System.out.println("no. is armstrong");
        }
        else{
            System.out.println("no.is not armstrong");
        }
        sc.close();
    }
}
