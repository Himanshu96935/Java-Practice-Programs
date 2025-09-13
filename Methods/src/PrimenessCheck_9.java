import java.util.*;
public class PrimenessCheck_9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number to check its Primeness:");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("Its Prime number");
        } else {
            System.out.println("Its not a Prime number");
        }
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
