import java.util.*;
public class ArrayaSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int row=sc.nextInt();
        System.out.println("enter the collom");
        int collom=sc.nextInt();
        int num1[][]=new int[row][collom];
        System.out.println("enter the element num1");
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                num1[i][j]=sc.nextInt();
            }
        }
        int num2[][]=new int[row][collom];
        System.out.println("enter the element num2");
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                num2[i][j]=sc.nextInt();
            }
        }
        System.out.println("element of num1 are:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                System.out.print(num1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("element of num2 are:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                System.out.print(num2[i][j]+" ");
            }
            System.out.println();
        }
        System.err.println("sum of array");
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                int sum=num1[i][j]+num2[i][j];
                System.out.print(sum+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
