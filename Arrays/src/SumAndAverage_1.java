import java.util.*;
public class SumAndAverage_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n[] = new int[10];

        int sum = 0;
        double avg;

        for (int i = 0; i <= 9; i++) {
            System.out.println("enter a number:");
            n[i] = sc.nextInt();

            sum += n[i];
        }
        avg = sum / 10.0;
        System.out.println("sum = " + sum + " and average = " + avg);
    }
}
