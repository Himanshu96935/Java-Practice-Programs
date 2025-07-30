import java.util.*;
public class SumOfNumberAtoB_Q15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter starting number : ");
        int a = sc.nextInt();
        System.out.println("Enter ending number : ");
        int b = sc.nextInt();

        int i, s = 0;
        for (i = a; i <= b; i++)
        {
            s = s + i;
        }
        System.out.println("Sum of numbers From A to B = " + s);
    }
}
