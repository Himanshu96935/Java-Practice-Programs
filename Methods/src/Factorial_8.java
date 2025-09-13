import java.util.*;
public class Factorial_8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        long fact = factorialOf(num);
        System.out.println("Factorial = " + fact);
    }

    public static long factorialOf(int num)
    {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
}
