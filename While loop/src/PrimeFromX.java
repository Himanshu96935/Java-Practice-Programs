import java.util.*;
public class PrimeFromX
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many primes you want (N):");
        int n = sc.nextInt();
        System.out.println("Enter Starting Number (X):");
        int x = sc.nextInt();

        int count = 0;
        int num = x;

        while (count < n)
        {
            int i = 2;
            boolean isPrime = true;

            while(i < num / 2) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (num > 1 && isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
