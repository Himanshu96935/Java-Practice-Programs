import java.util.*;
public class Calculator_6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st number: ");
        double num1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        double num2 = sc.nextInt();

        System.out.println("Enter operator : (+ , - , * , /)");
        char op = sc.next().charAt(0);

        double result;

        switch (op)
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator entered!");
        }
    }
}
