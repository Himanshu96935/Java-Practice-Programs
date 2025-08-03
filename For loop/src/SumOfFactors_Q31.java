import java.util.*;
public class SumOfFactors_Q31
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i, s = 0;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                s = s + i;
            }
        }
        System.out.println("Sum of the factor of " + n + " = " + s);

    }
}
