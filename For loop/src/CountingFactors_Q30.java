import java.util.*;
public class CountingFactors_Q30
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to which we have to find the no. of factors:");
        int n = sc.nextInt();
        int i, count = 0;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                count += 1;
            }
        }
        System.out.println("No of factors = " + count);

    }
}
