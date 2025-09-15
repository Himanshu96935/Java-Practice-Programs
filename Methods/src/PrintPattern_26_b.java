import java.util.*;
public class PrintPattern_26_b
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = sc.nextInt();
        pyramidPattern(n);
    }
    public static void pyramidPattern(int n)
    {
        for (int i = 1; i <= n; i++) {
            //printing space:
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //printing numbers:
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
