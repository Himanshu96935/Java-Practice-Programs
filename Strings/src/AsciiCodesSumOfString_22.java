import java.sql.SQLOutput;
import java.util.*;
public class AsciiCodesSumOfString_22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string:");
        String s = sc.nextLine();

        int sum = 0;
        System.out.println("Character________ASCII");
        System.out.println("______________________");

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + "--------" + ascii);
            sum += ascii;
        }
        System.out.println("Sum of ASCII values = " + sum);
    }
}
