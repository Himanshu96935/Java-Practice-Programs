import java.util.*;
public class NumberCheck_10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        switch (count)
        {
            case 5:
                int reverse = 0;
                temp = num;
                while (temp != 0) {
                    reverse = reverse * 10 + temp % 10;
                    temp /= 10;
                }
                System.out.println("Reverse of Number = " + reverse);

            case 4:
                int s = 0;
                temp = num;
                while (temp != 0) {
                    s += temp % 10;
                    temp /= 10;
                }
                System.out.println("Sum of the digits of a number = " + s);

            case 3:
                int first = num;
                int last = num % 10;
                while (first >= 10) {
                    first /= 10;
                }
                int sumFirstLastDigit = first + last;
                System.out.println("Sum of first and last digit = " + sumFirstLastDigit);
                break;

            default:
                System.out.println("Number should be 3, 4, or 5 digits only.");
        }
    }
}
