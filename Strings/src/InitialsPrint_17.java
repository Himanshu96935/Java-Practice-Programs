import java.util.*;
public class InitialsPrint_17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter full name");
        String s = sc.nextLine() + " ";
        String word = "";
        int spaceCount = 0;

        // counting number of words through space count:
        for (int i= 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                spaceCount++;
            }
        }

        int currentWordCount = 0;
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                currentWordCount++;

                if (word.length() > 0 && currentWordCount == 1) {
                    System.out.print(Character.toUpperCase(word.charAt(0)) + word.substring(1) +" ");
                } else {
                    System.out.print(Character.toUpperCase(word.charAt(0)) + ".");
                }
                word = "";
            }
        }
    }
}
