import java.sql.SQLOutput;
import java.util.*;
public class StringCaseCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a name:");
        String s = sc.nextLine();

        if (s.equals(s.toUpperCase())) {
            System.out.println("Uppercase String");
        } else if (s.equals(s.toLowerCase())) {
            System.out.println("Lowecase String");
        } else {
            System.out.println("Mixed case String");
        }
    }
}
