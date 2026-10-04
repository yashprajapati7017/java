import java .util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operater");
        char character=sc.next().charAt(0);
        switch(character){
            case '+':
            int sum=a+b;
            System.out.println(sum);
            break;
            case '-':
            int sub=a-b;
            System.out.println(sub);
            break;
            case '*':
            int multi=a*b;
            System.out.println(multi);
            break;
            case '/':
            int divide=a/b;
            System.out.println(divide);
            break;
            case '%':
            int denomenater=a%b;
            System.out.println(denomenater);
            break;
            default :
            System.out.println("invaled operater");
            break;
        }
        sc.close();
    }
}
