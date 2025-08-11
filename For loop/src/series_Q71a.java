import java.util.*;
public class series_Q71a
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the value for n:");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++)
        {
            long f = 1;
            for (int j = 1; j <=i; j++)
            {
                f = f * j;
            }
            sum = sum + (1.0 / f);
        }
        System.out.println("sum = " + sum);
    }
}
