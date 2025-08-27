import java.util.*;
public class PrimeCheck_22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number to check its prime or not:");
        int n = sc.nextInt();

        while (n != 1)
        {
            if (n == 0) {
                System.out.println(n + " is not a Prime Number");
            }

            boolean isPrime = true;
            for (int i = 2; i*i <= n; i++)
            {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is not a Prime Number");
            }

            System.out.println("enter 1 to terminate any other to continue");
            n = sc.nextInt();
        }
    }
}
