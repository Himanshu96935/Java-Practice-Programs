import java.util.*;
public class PrimeFactors_24
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.print("Prime factors of " + n + " = ");
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0) {
                if(isPrme(i)) {
                    System.out.print( i + "  ");
                }
            }
        }
    }
    public static boolean isPrme(int n)
    {
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++)
        {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
