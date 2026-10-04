import java.util.Scanner;

public class chatgtp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the operator (+, -, *, /, %):");
        char character = sc.next().charAt(0);

        switch (character) {
            case '+':
                int sum = a + b;
                System.out.println(sum);
                break;
            case '-':
                int sub = a - b;
                System.out.println(sub);
                break;
            case '*':
                int multi = a * b;
                System.out.println(multi);
                break;
            case '/':
                if (b != 0) {
                    int divide = a / b;
                    System.out.println(divide);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                int remainder = a % b;
                System.out.println(remainder);
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}

