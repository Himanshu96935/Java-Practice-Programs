public class ThreeDigitChecker_Q47
{
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++)
        {
            int firstDigit = i / 100;
            int secondDigit = (i / 10) % 10;
            int lastDigit = i % 10;

            if (firstDigit % 2 != 0 && secondDigit % 5 == 0 && lastDigit % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
