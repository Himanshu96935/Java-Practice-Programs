import java.util.*;
public class InitialsOfName_15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter full name of a person:");
        String name = sc.nextLine() + " ";

        String word = "";
        String initials = "";

        for (int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                initials += word.charAt(0) + ".";
                word = "";
            }
        }
        System.out.println("Initials of name : " + initials);
    }
}
