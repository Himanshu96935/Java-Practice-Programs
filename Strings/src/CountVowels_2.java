import java.util.*;
public class CountVowels_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'a' ||
                ch == 'E' || ch == 'e' ||
                ch == 'I' || ch == 'i' ||
                ch == 'O' || ch == 'o' ||
                ch == 'U' || ch == 'u')
            {
                c++;
            }
        }
        System.out.println("Total vowels = " + c);
    }
}
