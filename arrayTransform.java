import java.util.*;
public class arrayTransform {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int row=sc.nextInt();
        System.out.println("enter the collom");
        int collom=sc.nextInt();
        int trans[][]=new int[row][collom];
        System.out.println("enter the element");
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                trans[i][j]=sc.nextInt();
            }
        }
        System.out.println("element are:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                System.out.print(trans[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("matrix transform");
            for(int j=0;j<collom;j++){
                for(int i=0;i<row;i++){
                    System.out.print(trans[i][j]+"  ");
                }
                System.out.println();
            }
            sc.close();
    }
}
