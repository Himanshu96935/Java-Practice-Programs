import java.util.*;
public class DaysConverter39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of days:");
        int days = sc.nextInt();

        int years  = days / 365;
        days  = days % 365;

        int months = days / 30;
        days = days % 30;

        int weeks = days / 7;
        days = days % 7;

        System.out.println("Years:"+years);
        System.out.println("Months:"+months);
        System.out.println("Weeks:"+weeks);
        System.out.println("Days:"+days);

    }
}
