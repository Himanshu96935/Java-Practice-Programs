import java.util.*;
public class CheckPrimeness_Q32
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its Primeness:");
        int n = sc.nextInt();
        int i, count = 0;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                count = count + 1;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
