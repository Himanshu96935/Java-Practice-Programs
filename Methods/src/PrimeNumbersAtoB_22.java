import java.util.*;
public class PrimeNumbersAtoB_22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of A (FROM WHERE U WANT TO START)");
        int A = sc.nextInt();
        System.out.println("Enter the value of B (upto where u want to find out)");
        int B = sc.nextInt();
        primeFrom(A, B);
    }

    public static void primeFrom(int a, int b)
    {
        for (int i = a; i <= b; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                    isPrime = false;
                break;
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
