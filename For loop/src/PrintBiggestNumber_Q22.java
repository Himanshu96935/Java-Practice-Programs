import java.util.*;
public class PrintBiggestNumber_Q22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();;
        int big = n;
        for (int i = 1; i <= 999; i++)
        {
            System.out.println("enter a number:");
            n = sc.nextInt();
            if (n > big) {
                big = n;
            }
        }
        System.out.println("Biggest number = " + big);
    }
}