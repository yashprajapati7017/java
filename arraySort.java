/*import java.util.*;
public class arraySort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("element are:-");         //not output
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(num[i]>num[i+1]){
                    int sort=num[i];
                    num[i]=num[i+1];
                    num[i+1]=sort;
                }
            }
        }
        System.out.println("new element are:-");
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }
        sc.close();
    }
}
*/
 
import java.util.*;
public class arraySort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int num[]= new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("element are:-");
        for(int i=0;i<size;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("sort :-");
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(num[j]>num[j + 1]){
                    int temp=num[j];
                    num[j]=num[j + 1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(num[i]);
        }
        sc.close();
    }
}
    
