import java.util.*;
public class functionName {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);
        sc.close();
    }
}
