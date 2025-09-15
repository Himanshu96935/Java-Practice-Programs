import java.util.*;
public class Pattern_26_a
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
