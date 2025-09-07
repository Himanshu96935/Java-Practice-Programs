public class PrimeNumbers1to100
{
    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100 are : ");

        for (int i = 2; i <= 100; i++) {
            if (primeCheck(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean primeCheck (int i)
    {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++)
        {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
