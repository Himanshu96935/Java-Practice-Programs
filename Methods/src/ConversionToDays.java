import java.util.*;
public class ConversionToDays
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of years:");
        int yrs = sc.nextInt();
        System.out.println("Enter no of Months:");
        int months = sc.nextInt();
        System.out.println("Enter no of weeks:");
        int weeks = sc.nextInt();
        System.out.println("Enter no of days:");
        int days = sc.nextInt();
        int total = toDays(yrs,months,weeks,days);
        System.out.println("Total days = " + total);
    }

    // Methods to convert into days:
    public static int toDays (int years, int months, int weeks, int days)
    {
        int t = (years*365) + (months*30) + (weeks*7) + days;
        return t;
    }
}
