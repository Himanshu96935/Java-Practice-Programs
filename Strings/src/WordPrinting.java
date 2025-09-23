import java.util.*;
public class WordPrinting
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ener a Sentence:");
        String s = sc.nextLine();

        int i;
        String z = "";
        for (i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x != ' ') {
                z = z + x;
            } else {
                System.out.println(z);
                z = "";
            }
        }
        if (!z.equals("")) {
            System.out.println(z);
        }
    }
}
