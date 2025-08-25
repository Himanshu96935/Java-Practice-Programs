import java.util.*;
public class NextPrimeNumber_21
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();

        int nextPrime = n + 1;

        while (true)
        {
            int i = 2;
            boolean isPrime = true;

            while (i <= nextPrime/2)
            {
                if (nextPrime % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println("Next Prime number is : " + nextPrime);
                break;
            }
            nextPrime++;
        }
    }
}
