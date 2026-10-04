import java.util.*;
public class arraySearching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int search[]= new int[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++){
            search[i]=sc.nextInt();
        }
        System.out.println("element are:-");
        for(int i=0;i<size;i++){
            System.out.println(search[i]);
        }
        System.out.println("enter the serarching character");
        int character=sc.nextInt();
        for(int i=0;i<size;i++){
            if(search[i]==character){
                System.out.println("element podision");
                System.out.println(i);
            }
        }
        sc.close();
    } 
}
