import java.util.*;
public class PerfectNumbersAtoB_Q63
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int A = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int B = sc.nextInt();
        System.out.println("Perfect numbers are : ");

        for (int i = A; i <= B; i++)
        {
            int s = 0;
            for (int k = 1; k < i; k++)
            {
                if (i % k == 0) {
                    s = s + k;
                }
            }
            if (s == i) {
                System.out.println(i);
            }
        }
    }
}
