import java.util.*;
public class SumOfMultiples_Q45
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number whose multiple needed");
        int K = sc.nextInt();
        System.out.println("Enter how many times multiples needed:");
        int N = sc.nextInt();;
        int s = 0;
        for (int i = 1; i <= N; i++)
        {
            s = s + (K * i);
        }
        System.out.println("Sum of first N multiples of an integer K = " + s);
    }
}
