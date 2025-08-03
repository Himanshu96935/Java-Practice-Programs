import java.sql.SQLOutput;
import java.util.*;
public class FindingFactors_Q29
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n,i;
        System.out.println("enter the to which you want to find factors:");
        n = sc.nextInt();;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
