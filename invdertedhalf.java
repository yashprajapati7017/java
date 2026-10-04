//rotatinh 180
import java.util.*;
public class invdertedhalf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println( );
        }
        sc.close();
    }
}
