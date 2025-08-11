public class TwinPrimeNumbers_Q66
{
    public static void main(String[] args) {
        System.out.println("Twin prime Numbers:");
        for (int i = 2; i <= 100; i++)
        {
            boolean isPrime = true;  // its for i
            boolean isPrime2 = true; // its for i+2

            for (int j = 2; j <= i/2; j++)
            {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            int next = i + 2;
            for (int j = 2; j <= next/2; j++)
            {
                if (next % j == 0) {
                    isPrime2 = false;
                }
            }
            if (isPrime && isPrime2 && next <= 100) {
                System.out.println("(" + i + "," + next + ")");
            }
        }
    }
}
