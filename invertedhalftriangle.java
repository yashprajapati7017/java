import java.util.*;
public class invertedhalftriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();
        for(int i=length;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println( );
        }
        sc.close();
    }
}
