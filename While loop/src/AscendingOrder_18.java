import java.util.*;
public class AscendingOrder_18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        n = Math.abs(n);

        int digit = 0; // start from 0

        while (digit <= 9) {  // check digits from 0 to 9
            int temp = n; // copy original number
            while (temp != 0) {
                int lastD = temp % 10; // extract last digit
                if (lastD == digit) {
                    System.out.print(digit); // print if matches
                }
                temp = temp / 10; // remove last digit
            }
            digit++; // go to next digit
        }
    }
}
