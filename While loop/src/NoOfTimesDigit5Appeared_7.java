import java.util.*;
public class NoOfTimesDigit5Appeared_7
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        {
            System.out.println("Enter a number to check How many times digit 5 appeared : ");
            int num = sc.nextInt();

            int count = 0, digit;
            while (num != 0)
            {
                digit = num % 10;
                if (digit % 5 == 0) {
                    count++;
                }
                num = num / 10;
            }
            if (count > 0) {
                System.out.println("Number of times 5 appeared = " + count);
            } else {
                System.out.println("Number of times 5 appeared = 0");
            }

        }
    }
}
