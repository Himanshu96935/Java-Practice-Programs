import java.util.*;
public class Hcf_Q34
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i, hcf = 0;
        for (i = 1; i <= a && i <= b; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " = " + hcf);
    }
}
