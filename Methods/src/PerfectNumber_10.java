import java.util.*;
public class PerfectNumber_10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (isPerfectNumber(num)) {
            System.out.println("It's Perfect Number");
        } else {
            System.out.println("It's not a Perfect Number");
        }
    }

    public static boolean isPerfectNumber(int n)
    {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s == n;
    }
}
