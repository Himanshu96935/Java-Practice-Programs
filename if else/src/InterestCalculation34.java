import java.util.*;
public class InterestCalculation34
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Principal Amount");
        double principal = sc.nextDouble();

        System.out.println("Enter Time in years");
        double time = sc.nextDouble();

        System.out.println("Choose Scheme: 1 for Yearly simple interest , 2 for cumulative compound interest");
        int scheme = sc.nextInt();

        double rate;

        if (time <= 1) {
            rate = 6;
        } else if (time <= 2) {
            rate = 8;
        } else {
            rate = 10;
        }

        double interest;

        if (scheme == 1) {
            interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + interest);
        } else if (scheme == 2) {
            double amount = principal * Math.pow((1 + rate / 100) , time);
            interest = amount - principal;
            System.out.println("Compound Interst = " + interest);
        } else {
            System.out.println("Invalid scheme selected");
        }
    }
}
