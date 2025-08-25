import java.util.*;
public class PrimeCounter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, primeCount = 0;
        System.out.println("enter a number:");
        n = sc.nextInt();
        while (n != 500)
        {
            if (n > 1) {
                boolean isPrime = true;
                for (int i = 2; i * i <= n; i++)
                {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeCount++;
                }
                System.out.println("enter 500 to terminate any other to continue:");
                n = sc.nextInt();
            }
        }
        System.out.println("Number of prime numbers entered: " + primeCount);
    }
}