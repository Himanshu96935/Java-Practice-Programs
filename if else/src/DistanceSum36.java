import java.util.*;
public class DistanceSum36
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st distances in meter:");
        int m1 = sc.nextInt();
        System.out.println("Enter 1st distances in centimeters:");
        int cm1 = sc.nextInt();

        System.out.println("Enter 2nd distance in meter");
        int m2 = sc.nextInt();
        System.out.println("Enter 2nd distance in centimeters");
        int cm2 = sc.nextInt();

        int totalMeter = m1 + m2;
        int totalCm = cm1 + cm2;

        if (totalCm >= 100) {
            totalMeter += totalCm / 100;
            totalCm = totalCm % 100;
        }
        System.out.println("Total Distance = " + totalMeter + " meters and " + totalCm + " centimeters");


    }
}
