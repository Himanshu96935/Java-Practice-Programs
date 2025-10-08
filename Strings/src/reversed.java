import java.util.*;
public class reversed
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String rev = "";  // to store reversed string

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);  // add characters from end to start
        }

        System.out.println("Reversed string: " + rev);
    }

}
