import java.util.*;
public class FrequencyCountOfCharacters_39
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string:");
        String s  = sc.nextLine();

        String checked = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (checked.indexOf(ch) == -1)
            {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " = " + count);
                checked += ch;
            }
        }

    }
}
