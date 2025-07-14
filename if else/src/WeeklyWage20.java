import java.util.*;
public class WeeklyWage20
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter work hours = ");
        int H = sc.nextInt();
        System.out.println("enter hourly rate");
        int R = sc.nextInt();
        double pay;

        if (H <= 35)
        {
            pay = H * R;
        } else if (H <= 55) {
            pay = (35 * R) + (H - 35) * (1.5 * R);
        }
        else {
            pay = (35 * R) + (20 * 1.5 * R) + (H - 55) * (2 * R);
        }
        System.out.println("weekly wage = " + pay);


    }
}
