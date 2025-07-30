import java.util.*;
public class PrintingEvenNumbersAtoB_Q12
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter starting number:");
        int a = sc.nextInt();
        System.out.println("Enter ending number:");
        int b = sc.nextInt();

        int i;
        for (i = a; i <= b; i++)
        {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
