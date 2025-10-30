import java.util.*;
public class CountEvenSumOdd_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num[] = new int[25];

        int count = 0, s = 0;
        for (int i = 0; i <= 24; i++)
        {
            System.out.println("Enter a number:");
            num[i] = sc.nextInt();

            if (num[i] % 2 == 0)
                count++;
            else
                s += num[i];
        }
        System.out.println("Number of even numbers = " + count + " and Sum of odd numbers = " + s);
    }
}
