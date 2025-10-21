import java.util.*;
public class PossibleCombination_50
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter only 3letter word:");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    // check that all letters are different
                    if (i != j && j != k && i != k) {
                        System.out.println("" + word.charAt(i) + word.charAt(j) + word.charAt(k));
                    }
                }
            }
        }
    }
}
