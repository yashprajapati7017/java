import java.util.*;
public class Array2d {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        int array[][]=new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
