import java.util.*;
public class BinomialCoefficient
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter value of n:");
        int n = sc.nextInt();
        System.out.println("enter value for r:");
        int r = sc.nextInt();

        int x = factorialOf (n);
        int y = factorialOf (r);
        int z = factorialOf (n-r);
        double result = (x * 1.0) / (y * z);
        System.out.println("Binomial Coefficient = " + result);
    }

    public static int factorialOf(int k)
    {
        int f = 1;
        for (int i = 1; i <= k; i++) {
            f *= i;
        }
        return f;
    }
}
