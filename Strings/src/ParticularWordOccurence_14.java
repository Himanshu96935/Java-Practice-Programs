import java.util.*;
public class ParticularWordOccurence_14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string:");
        String s = sc.nextLine().toLowerCase() + " ";

        System.out.println("Enter the word to check:");
        String wordToCheck = sc.next().toLowerCase();

        String word = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                word += ch;
            } else {
                if (word.equals(wordToCheck)) {
                    count++;
                }
                word = "";
            }
        }
        System.out.println("The word " +wordToCheck + " occurs " + count + " times");

    }
}
