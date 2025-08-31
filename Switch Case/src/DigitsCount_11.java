import java.util.*;
public class DigitsCount_11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        long num = sc.nextLong();

        int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;

        while (num > 0) {
            int digit = (int)(num % 10);
            switch (digit) {
                case 0: c0++; break;
                case 1: c1++; break;
                case 2: c2++; break;
                case 3: c3++; break;
                case 4: c4++; break;
                case 5: c5++; break;
                case 6: c6++; break;
                case 7: c7++; break;
                case 8: c8++; break;
                case 9: c9++; break;
            }
            num /= 10;

        }

        // Print the counts (only if greater than 0)
        if(c0 > 0) System.out.println("Digit 0 occurs " + c0 + " times.");
        if(c1 > 0) System.out.println("Digit 1 occurs " + c1 + " times.");
        if(c2 > 0) System.out.println("Digit 2 occurs " + c2 + " times.");
        if(c3 > 0) System.out.println("Digit 3 occurs " + c3 + " times.");
        if(c4 > 0) System.out.println("Digit 4 occurs " + c4 + " times.");
        if(c5 > 0) System.out.println("Digit 5 occurs " + c5 + " times.");
        if(c6 > 0) System.out.println("Digit 6 occurs " + c6 + " times.");
        if(c7 > 0) System.out.println("Digit 7 occurs " + c7 + " times.");
        if(c8 > 0) System.out.println("Digit 8 occurs " + c8 + " times.");
        if(c9 > 0) System.out.println("Digit 9 occurs " + c9 + " times.");
    }
}
