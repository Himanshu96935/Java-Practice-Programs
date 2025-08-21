import java.util.*;
public class SpecialNumber_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether its special number or not:");
        int num = sc.nextInt();
        int digit, sum = 0, original = num;
        while (num != 0)
        {
            int fact = 1;
            digit = num % 10;
            num = num / 10;
             for (int i = 1; i <= digit; i++) {
                 fact = fact * i;
             }
             sum = sum + fact;
        }
        if (sum == original) {
            System.out.println(original + " is a special number");
        } else {
            System.out.println(original + " is not a special number");
        }
    }
}
