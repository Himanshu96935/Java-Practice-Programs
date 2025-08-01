import java.util.*;
public class CountGreaterThan100_Q20
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, count = 0;
        System.out.println("Enter 20 numbers:");
        for (i = 1; i <= 20; i++)
        {
            int num = sc.nextInt();
            if (num > 100) {
                count++;
            }
        }
        System.out.println("Numbers greater than 100 = " + count);
    }
}
