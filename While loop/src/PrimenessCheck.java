import java.util.*;
public class PrimenessCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check primeness:");
        int n = sc.nextInt();
        while (n != 500)
        {
            int factCount = 0;
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0) {
                    factCount++;
                }
            }
            if (factCount == 2) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println("Its not prime");
            }
            System.out.println("Enter 500 to terminate and any other to continue" );
            n = sc.nextInt();
        }
    }
}
