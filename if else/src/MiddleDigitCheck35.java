import java.util.*;
public class MiddleDigitCheck35
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st three digit number:");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd three digit number:");
        int n2 = sc.nextInt();

        int m1 = (n1 / 10) % 10;
        int m2 = (n2 / 10) % 10;

        if (m1 == m2) {
            System.out.println("Middle digits are same. ");
        } else {
            System.out.println("Middle digits are not same.");
        }
    }
}
