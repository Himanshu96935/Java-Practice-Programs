import java.util.*;
public class NumberPrintingAtoB_Q11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a starting number:");
        int a = sc.nextInt();

        System.out.println("Enter ending number:");
        int b = sc.nextInt();

        int i;
        for (i=a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
}
