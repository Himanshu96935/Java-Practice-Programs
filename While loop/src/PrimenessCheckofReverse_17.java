import java.util.*;
public class PrimenessCheckofReverse_17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n, r = 0, digit;
        System.out.println("enter a number:");
        n = sc.nextInt();
        int original = n;

        while (n != 0)
        {
            digit = n % 10;
            r = r * 10 + digit;
            n = n / 10;
        }

        boolean isOriginalPrime = true;
        if (original < 2) {
            isOriginalPrime = false;
        } else {
            for (int i = 2; i * i <= original; i++)
            {
                if (original % i == 0) {
                    isOriginalPrime = false;
                    break;
                }
            }
        }

        boolean isReversePrime = true;
        if (r < 2) {
            isReversePrime = false;
        } else {
            for (int j = 2; j * j <= r; j++)
            {
                if (r % j == 0) {
                    isReversePrime = false;
                    break;
                }
            }
        }
        if (isOriginalPrime && isReversePrime) {
            System.out.println("Both number and its reverse are prime");
        } else {
            System.out.println("Both number and its reverse are not prime");
        }
    }
}
