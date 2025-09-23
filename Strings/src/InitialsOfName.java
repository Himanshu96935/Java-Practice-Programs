import java.util.*;
public class InitialsOfName
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name of a person:");
        String name = sc.nextLine() + " ";

        String word = "", initial = "";
        int i;
        for (i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                initial += word.charAt(0) + ".";
                word = "";
            }
        }
        System.out.println("Initial of name : " + initial);
    }
}
