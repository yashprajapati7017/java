import java.util.*;
public class twoDArraySearching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int row=sc.nextInt();
        System.out.println("enter the collom");
        int collom=sc.nextInt();
        System.out.println("enter the element");
        int twoArray[][]=new int[row][collom];
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                twoArray[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                System.out.print(twoArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the searching num");
        int num=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<collom;j++){
                if(twoArray[i][j]==num){
                    System.out.println(i+" "+j+" ");
                }
            }
        }
        sc.close();
    }

}
