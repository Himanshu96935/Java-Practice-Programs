import java.util.*;
public class NumberToWord
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a positive number:");
        int n = sc.nextInt();

        String k = "", a[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        while (n != 0) {
            int x = n % 10;
            k = a[x] + " " + k;
            n = n / 10;
        }
        System.out.println("Digits in word = " + k);
    }
}
