import java.util.*;
public class grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the subject marks");
        int english =sc.nextInt();
        int hindi=sc.nextInt();
        int maths=sc.nextInt();
        int science=sc.nextInt();
        int sst=sc.nextInt();
        int average=(english+hindi+maths+science+sst)/5;
        if(average>90){
            System.out.println("first grade");
        }
        else if(average>70 && average<=90){
            System.out.println("secend grade");
        }
        else if(average>50 && average>=70){
            System.out.println("third grade");
        }
        else{
            System.out.print("sorry");
        }
        sc.close();
  }
}