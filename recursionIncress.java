import java.util.*;
public class recursionIncress {
    public static void incress(int num){
        if(num==6){
            return;
        }
        System.out.println(num);
        incress(num+1);
    }
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        incress(num);
        sc.close();
    }
}
