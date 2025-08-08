public class PrimeNumbers_Q61
{
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++)
        {
            int count = 0;

            for (int k = 1; k <= i; k++ )
            {
                if (i % k == 0)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.println(i);
            }
        }
    }
}
