public class PerfectEvenOddZeroNumbers_12 {
    public static void main(String[] args)
    {
        for (int i = 1000; i <= 10000000; i++)
        {
            int n = i;
            int evenCount = 0, oddCount = 0, zeroCount = 0;
            while (n != 0)
            {
                int digit;

                digit = n % 10;
                if (digit == 0) {
                    zeroCount++;
                } else if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                n = n / 10;
            }
            if (zeroCount == 2) {
                System.out.println("Perfect zero number = " + i);
            }
            if (evenCount == 2) {
                System.out.println("Perfect even number = " + i);
            }
            if (oddCount == 2) {
                System.out.println("Perfect odd number = " + i);
            }
        }
    }

}