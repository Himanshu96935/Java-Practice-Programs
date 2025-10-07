import java.util.*;
public class VowelsToUppercase_29
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'A' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' ||
                ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
