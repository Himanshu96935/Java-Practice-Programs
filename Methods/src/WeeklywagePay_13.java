import java.util.*;
public class WeeklywagePay_13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of hours worked:");
        int H = sc.nextInt();
        System.out.println("Enter the rate per hour to be paid:");
        int R = sc.nextInt();
        double weeklyWage = pay(H, R);
        System.out.println("Weekly wage = " + weeklyWage);
    }
    public static double pay(int h, int r)
    {
        double payment;
        if (h <= 35) {
            payment = h * r;
        } else if (h <= 55) {
            payment = (35 * r) + (h - 35) * (1.5 * r);
        } else {
            payment = (35 * r) + (20 * (1.5 * r)) + ((h - 55) * 2 * r);
        }
        return payment;
    }
}
