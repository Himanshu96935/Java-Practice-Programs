import java.util.*;
public class PigLatin_44
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a word:");
        String word = sc.nextLine().toLowerCase();

        String vowels = "aeiou";
        int vowelIndex = -1;

        //finding the first vowel:
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                vowelIndex = i;
                break;
            }
        }
        if (vowelIndex == 0) {
            System.out.println("PigLatin = " + word + "ay");
        } else if (vowelIndex > 0) {
            String start = word.substring(0,vowelIndex);
            String end = word.substring(vowelIndex);
            System.out.println("PigLatin = " + end + start + "ay");
        } else {
            System.out.println("No vowels in the word, cannot convert to pig latin.");
        }
    }
}
