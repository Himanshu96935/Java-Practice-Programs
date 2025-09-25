import java.util.*;
public class ReverseString_7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a String");
        String s = sc.next();

        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev += ch;
        }
        System.out.println(rev);
    }
}
