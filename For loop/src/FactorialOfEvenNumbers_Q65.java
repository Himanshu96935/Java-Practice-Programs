import java.math.BigInteger;

public class FactorialOfEvenNumbers_Q65
{
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++)
        {
            long f = 1;

            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++)
                {
                    f = f * j;
                }
                System.out.println("Factorial of " + i + " = " + f);
            }
        }
    }
}
