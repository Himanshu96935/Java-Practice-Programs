import java.util.*;
public class AverageOfDigits_11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int x, count = 0, s = 0;
        while (n != 0)
        {
            x = n % 10;
            s += x;
            count++;
            n = n / 10;
        }
        double avg = (s * 1.0) / count;
        System.out.println("Average of digit in a number = " + avg);
    }
}
