import java.util.*;
public class CounVowelsOptimised_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine().toLowerCase(); // All converted to LOWER CASE

        String vowels = "aeiou";
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (vowels.indexOf(ch) != -1) {   // -1 returned if indexOf get false, Thats why != -1;
                c++;
            }
        }
        System.out.println("Number of vowels in a string  = " + c);
    }
}
