//This program converts the inputed days to years + months + weeks + days

import java.util.*;
public class DaysConversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter total number of days:");
        int days = sc.nextInt();
        daysToOthers (days);
    }

//Here method is created with void so no return but there is implicit return in JAVA so it automatically return to the main method.

    public static void daysToOthers (int days)
    {
        int yrs = days / 365;
        days = days % 365;
        int months = days / 30;
        days = days % 30;
        int weeks = days / 7;
        days = days % 7;
        System.out.println("Years = " + yrs);
        System.out.println("Months = " + months);
        System.out.println("Weeks = " + weeks);
        System.out.println("Days = " + days);
    }
}
