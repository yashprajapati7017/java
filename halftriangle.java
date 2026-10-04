import java.util.*;
public class halftriangle { 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of triangle");
        int length=sc.nextInt();
        for(int i=1;i<=length;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
