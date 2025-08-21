import java.sql.SQLOutput;
import java.util.*;
public class AverageofOddAndEven_9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int evenSum = 0, evenCount =0, oddSum = 0, oddCount = 0;
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        while (n != 1000)
        {
            if (n % 2 == 0) {
                evenSum += n;
                evenCount++;
            } else {
                oddSum += n;
                oddCount++;
            }
            System.out.println("Enter 1000 to terminate, any other to continue: ");
            n = sc.nextInt();
        }
        if (evenCount > 0) {
            System.out.println("Average of entered even number = " + (evenSum * 1.0) / evenCount);
        } else {
            System.out.println("No even numbers entered");
        }

        if (oddCount > 0) {
            System.out.println("Average of entered odd number = " + (oddSum * 1.0) / oddCount);
        } else {
            System.out.println("No odd numbers entered");
        }
    }
}
