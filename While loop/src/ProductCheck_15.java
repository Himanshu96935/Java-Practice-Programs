import java.util.*;
public class ProductCheck_15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, firstDigit, first2ndDigit, lastDigit, secondLastDigit;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        int temp = n;
        lastDigit = temp % 10;
        secondLastDigit = (temp / 10) % 10;
        while (temp >= 100)
        {
            temp = temp / 10;
        }
        first2ndDigit = temp % 10;
        firstDigit = temp / 10;
        int p1 = firstDigit * first2ndDigit;
        int p2 = lastDigit * secondLastDigit;

        if (p1 == p2) {
            System.out.println("Product matches");
        } else {
            System.out.println("product not matches");
        }

    }
}
