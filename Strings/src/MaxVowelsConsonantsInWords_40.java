import java.util.*;
public class MaxVowelsConsonantsInWords_40
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a sentence:");
        String s = sc.nextLine() + " ";

        String word = "";
        String maxVowelWord = "", maxConsonantWord = "";
        int maxVowelCount = 0, maxConsonantCount = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch; // build word
            } else {
                //count vowels and consonants:
                int vCount = 0, cCount = 0;
                for (int j = 0; j < word.length(); j++)
                {
                    char wch = Character.toLowerCase(word.charAt(j));
                    if (wch >= 'a' && wch <= 'z') { //only alphabets
                        if (wch == 'a' || wch == 'e' || wch == 'i' || wch == 'o' || wch == 'u') {
                            vCount++;
                        } else {
                            cCount++;
                        }
                    }

                }
                // check for max vowels
                if (vCount > maxVowelCount) {
                    maxVowelCount = vCount;
                    maxVowelWord = word;
                }

                // check for max consonants
                if (cCount > maxConsonantCount) {
                    maxConsonantCount = cCount;
                    maxConsonantWord = word;
                }
                word = "";
            }

        }
        System.out.println("word with highest vowels: " + maxVowelWord + " (" + maxVowelCount + ")");
        System.out.println("word with highest consonants: " + maxConsonantWord + " (" + maxConsonantCount + ")");
    }
}
