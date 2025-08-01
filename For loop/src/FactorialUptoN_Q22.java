import java.util.*;
public class FactorialUptoN_Q22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N, i;
        long f = 1;
        System.out.println("enter a number:");
        N = sc.nextInt();
        for (i = 1; i <= N; i++)
        {
            f *= i;
        }
        System.out.println("Factorial = " + f);
    }
}
