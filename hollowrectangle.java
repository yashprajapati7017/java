import java.util.*;
public class hollowrectangle {
   public static void main(String[] arge){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the row");
    int row =sc.nextInt();
    System.out.println("enter the collom");
    int collom=sc.nextInt();
    for(int i=1;i<=row;i++){
        for(int j=1;j<=collom;j++){
            if(i==1 || j==1 || j==collom || i==row){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    sc.close();
   } 
}
//chat GPT
/*import java.util.*;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row:");
        int row = sc.nextInt();

        System.out.println("Enter the column:");
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}*/