import java.util.*;
public class CounterForPositiveNegativeNumbers_10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int positiveCount = 0, oddCount = 0;
        while (n != 0)
        {
            if (n > 0) {
                positiveCount += 1;
            } else {
                oddCount += 1;
            }
            System.out.println("Enter 0 to terminate, any other to continue");
            n = sc.nextInt();;
        }
        if (positiveCount > 0) {
            System.out.println("Number of +ive number entered : " + positiveCount);
        } else {
            System.out.println("No +ive numbere entered.");
        }
        if (oddCount > 0) {
            System.out.println("Number of -ve number entered : " + oddCount);
        } else {
            System.out.println("No -ve numbere entered.");
        }
    }
}
