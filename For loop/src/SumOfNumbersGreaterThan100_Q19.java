import java.util.*;
public class SumOfNumbersGreaterThan100_Q19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, s = 0,num;
        System.out.println("Enter 20 numbers:");
        for (i = 1; i <= 20; i++)
        {
            num = sc.nextInt();
            if (num > 100) {
                s += num;
            }
        }
        System.out.println("Sum of the numbers greater than 100 = " + s);
    }
}
