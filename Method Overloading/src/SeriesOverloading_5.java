import java.util.*;
public class SeriesOverloading_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        double series1 = series(n);
        double series2 = series(a, n);

        System.out.println("1st Series = " + series1);
        System.out.println("2nd Series = " + series2);
    }

    public static double series(double n)
    {
        double sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }

    public static double series(double a, double n)
    {
        double sum = 0;
        int numerator = 1;
        int power = 2;

        for (int i= 1; i <= n; i++) {
            sum = sum + (double) numerator / Math.pow(a, power);
            numerator += 3;
            power += 3;
        }
        return sum;
    }
}
