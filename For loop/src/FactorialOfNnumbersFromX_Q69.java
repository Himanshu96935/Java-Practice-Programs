import java.util.*;
public class FactorialOfNnumbersFromX_Q69
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int x = sc.nextInt();
        System.out.println("Enter no . of factorial you want to print");
        int n  = sc.nextInt();

        for (int i = x; i < (x+n); i++)
        {
            long f = 1;

            for (int j = 1; j <= i; j++)
            {
                f = f * j;
            }

            System.out.println("Factorial of " + i + " = " + f);
        }
    }
}
