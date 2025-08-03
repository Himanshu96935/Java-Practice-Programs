import java.util.*;
public class Factorial_Q28
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int num, i;
        long f = 1;
        System.out.println("Enter a number for finding factorial of it:");
        num = sc.nextInt();
        for (i = 1; i <= num; i++)
        {
            f = f * i;
        }
        System.out.println("Factorial of " + num + "= " + f);
    }
}
