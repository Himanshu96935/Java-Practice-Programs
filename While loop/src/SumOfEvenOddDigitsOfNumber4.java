import java.util.*;
public class SumOfEvenOddDigitsOfNumber4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0, x;
        while (n != 0)
        {
            x = n % 10;
            if (x % 2 == 0) {
                evenSum += x;
            } else {
                oddSum += x;
            }
            n = n / 10;
        }
        System.out.println("Even sum of digits = " + evenSum);
        System.out.println("Odd sum of digits = " + oddSum);
    }
}
