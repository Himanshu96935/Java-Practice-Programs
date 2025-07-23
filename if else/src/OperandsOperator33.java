//Input two operand and an perator  and display th calculated result.
import java.util.*;
public class OperandsOperator33
{
    public static void main (String args[])
    {
        Scanner sc =  new Scanner (System.in);

        System.out.println("Enter first operand:");
        double a = sc.nextInt();

        System.out.println("Enter second operand:");
        double b = sc.nextInt();

        System.out.println("Enter an operator (+ , - , / , *) : ");
        char operator = sc.next().charAt(0);

        double result;

        if (operator == '+') {
            result = a + b;
            System.out.println("Result = " + result);
        } else if (operator == '-') {
            result = a - b;
            System.out.println("Result = " + result);
        } else if (operator == '*') {
            result = a * b;
            System.out.println("Result = " + result);
        } else if (operator == '/') {
            if (b != 0) {
                result = (double) a / b;
                System.out.println("Result = " + result);
            } else {
                System.out.println("ERROR:Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid Operator:Please enter (+ , - , / , *) only");
        }
    }
}
