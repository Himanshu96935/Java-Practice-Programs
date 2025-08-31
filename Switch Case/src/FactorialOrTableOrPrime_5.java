import java.util.*;
public class FactorialOrTableOrPrime_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter choice : 1 for Factorial, 2 for Table, 3 for Prime Check");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Enter a number to know its Factorial:");
                int n = sc.nextInt();
                int f = 1;
                for (int i = 1; i <=n; i++) {
                    f = f * i;
                }
                System.out.println("Factorial of " + n + " = " + f);
                break;
            case 2:
                System.out.println("Enter a number to print it's Table:");
                n = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " * " + i + " = " + n * i);
                }
                break;
            case 3:
                System.out.println("Enter a number to check it's prime or not");
                n = sc.nextInt();
                if (n <= 1) {
                    System.out.println(n + " is not Prime Number");
                } else {
                    boolean isPrime = true;
                    for (int i = 2; i * i <= n; i++) {
                        if (n % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println( n + " is a Prime Number");
                    } else {
                        System.out.println(n + " is not a Prime Number");
                    }
                }
                break;
            default:
                System.out.println("Invalid choice entered");
        }
    }
}
