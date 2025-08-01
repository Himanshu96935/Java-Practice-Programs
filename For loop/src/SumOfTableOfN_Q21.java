import java.util.*;
public class SumOfTableOfN_Q21
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, s = 0;
        System.out.println("Enter a number for printing the sum of the table of that number:");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++)
        {
            s += (n * i);
        }
        System.out.println("Sum of table of " + n + " is: " + s);
    }
}
