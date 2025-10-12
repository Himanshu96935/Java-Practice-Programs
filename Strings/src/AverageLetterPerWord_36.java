import java.util.*;
public class AverageLetterPerWord_36
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string:");
        String s = sc.nextLine() + " ";

        int letterCount = 0, wordCount = 0;
        String word = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > 0) {
                    letterCount += word.length();
                    wordCount++;
                    word = "";
                }
            }
        }
        double average = (double)letterCount / wordCount;
        System.out.println("Average letter per word  = " + average);
    }
}
