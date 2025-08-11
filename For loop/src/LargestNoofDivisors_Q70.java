public class LargestNoofDivisors_Q70
{
    public static void main(String[] args) {

        int maxdivisor = 0;
        for (int i = 101; i < 500; i++)
        {
            int count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > maxdivisor) {
                maxdivisor = count;
            }

        }

        System.out.println("Numbers with maximum divisors (" + maxdivisor + ") between 100 and 500:");

        for (int i = 101; i < 500; i++)
        {
            int count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == maxdivisor) {
                System.out.println(i);
            }
        }
    }
}
