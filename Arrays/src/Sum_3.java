import java.util.*;
public class Sum_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num[] = new int[5];

        int sume = 0, sumo = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("enter a number:");
            num[i] = sc.nextInt();

            if (i % 2 == 0) {
                if (num[i] % 2 == 0)
                {
                    sume += num[i];
                }
            } else {
                if (num[i] % 2 != 0)
                {
                    sumo += num[i];
                }
            }
        }
        System.out.println("Sum of even numbers at even locations = " + sume);
        System.out.println("Sum of odd numbers at odd locations = " + sumo);
    }
}
