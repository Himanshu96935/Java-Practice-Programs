import java.util.*;
public class DigitCheckerFirstLastEven_14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("eneter a number");
        int n = sc.nextInt();
        int lastDigit = n % 10;
        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        if (lastDigit % 2 == 0 && firstDigit % 2 == 0) {
            System.out.println("Both First and last digit are even");
        } else {
            System.out.println("First and last digit are not even");
        }
    }
}
