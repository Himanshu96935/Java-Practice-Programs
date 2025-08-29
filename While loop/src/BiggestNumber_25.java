import java.util.*;
public class BiggestNumber_25
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter numbers between 1 and 500 (Enter 0 to stop):");
        int num = sc.nextInt();
        int biggest = 0;
        while (num != 0)
        {
                if (num > biggest) {
                    biggest = num;
                }
                num = sc.nextInt();
        }
        System.out.println("Biggest Number = " + biggest);
    }
}
