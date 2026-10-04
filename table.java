import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of table");
        int no =sc.nextInt();
        for(int i=0;i<=10;i++){
        int tab=no*i;
        System.out.println(tab);
        }
        sc.close();
    }
}
