import java.util.*;
public class PatternPrinting_9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string:");
        String s = sc.next();

        for (int i = s.length()-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        System.out.println("\t");

        for (int i = 0; i <= s.length()-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

        System.out.println("\t");

        for (int i = 0; i <= s.length()-1; i++) {
            for (int j = s.length() - i - 1; j <= s.length()-1; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
