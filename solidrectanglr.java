import java.util.*;
public class solidrectanglr {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the row");
        int row=sc.nextInt();
        System.out.println("enter the collem");
        int collem=sc.nextInt();
        for(int i=1;i<=collem;i++){
            for(int j=1;j<=row;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
