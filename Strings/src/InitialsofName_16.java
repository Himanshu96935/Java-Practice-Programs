import java.util.*;
public class InitialsofName_16
{
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter full name:");
        String s = sc.nextLine() + " ";
        String word = "";
        int spaceCount = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int currentWordCount = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > 0) {
                    currentWordCount++;

                    if (currentWordCount < spaceCount) {
                        System.out.print(Character.toUpperCase(word.charAt(0)) + ".");
                    } else {
                        System.out.print(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
                    }
                }
                word = "";
            }

=======
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name:");
        String s = sc.nextLine() + " ";

        String word = "";
        int spaceCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                spaceCount++;
        }

        int currentWord = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                currentWord++;

                if (currentWord < spaceCount) {
                    System.out.print(Character.toUpperCase(word.charAt(0)) + ".");
                } else {
                    System.out.print(word.toUpperCase());
                }

                word = "";
            }
>>>>>>> bc9520d0d956be6a5c299e62412db6ed3f1ca7e7
        }
    }
}
