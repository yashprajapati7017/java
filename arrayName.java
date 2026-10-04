import java.util.*;
public class arrayName {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the size");
        int size =sc.nextInt();
        String name[]=new String[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }
        System.out.println("element are:-");
        for(int i=0;i<size;i++){
            System.out.print(name[i]);
        }
        sc.close();
    }
}
