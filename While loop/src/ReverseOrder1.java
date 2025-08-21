import java.util.*;
public class ReverseOrder1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, r = 0, x;
        System.out.println("Enter a number that you want to reverse:");
        n = sc.nextInt();
        while (n != 0)
        {
            x = n % 10;
            r = r * 10 + x;
            n = n / 10;
        }
        System.out.println("Reverse of " + n + " = " + r);
    }
}
