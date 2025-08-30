import java.util.*;
public class MagicNumberCheck_29
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while (n > 9)
        {
            int sum = 0;
            while (n != 0)
            {
                sum += n % 10;
                n = n / 10;
            }
            n = sum;
        }
        if (n == 1) {
            System.out.println("Its a Magic Number");
        } else {
            System.out.println("Its not a magic number");
        }
    }
}
