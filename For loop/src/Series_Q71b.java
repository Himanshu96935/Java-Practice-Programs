import java.util.*;
public class Series_Q71b
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for n:");
        int n = sc.nextInt();

        double sum = 0;

        for(int i = 1; i <= n; i++)
        {
            int denom = 0;
            for (int j = 1; j <= i; j++)
            {
                denom = denom + j;
            }
            sum = sum + (1.0/denom);
        }
        System.out.println(sum);
    }
}
