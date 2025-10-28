import java.util.*;
public class SumOfEvenNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a[] = new int[10];

        int s = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.println("enter a number: ");
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0) {
                s += a[i];
            }
        }
        System.out.println("Sum of even numbers = " + s);
    }
}
