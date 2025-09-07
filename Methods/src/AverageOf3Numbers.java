import java.util.*;
public class AverageOf3Numbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = averageOf (a, b, c);
        System.out.println("Average of three numbers " + a + " " + b + " "+ c + " = " + avg);
    }

    public static double averageOf(int a, int b, int c)
    {
        double avg = (a+b+c) / (3 * 1.0);
        return avg;
    }
}
