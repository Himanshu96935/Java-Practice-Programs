import java.util.*;
public class ProductOfPrimeNumbers_Q68
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of P to which we want to print the product of prime numbers:");
        int p = sc.nextInt();

        long product = 1;

        for (int i = 1; i <= p; i++)
        {
            int count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                product = product * i;
            }
        }
        System.out.print(product);

    }
}
