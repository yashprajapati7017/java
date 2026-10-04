import java.util.*;
public class palidrom {
    public static void main(String agrs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no");
    int no=sc.nextInt();
    int copy=no;
    int poli=0;
    for(int i=1;i<=4;i++){
       poli=no%10+poli*10;
       no=no/10;
    }
    if(poli==copy){
        System.out.println("no. is poli");
    }
    else{
        System.out.println("no. is not poli");
    }
    sc.close();
    }
}
