import java.util.*;
public class Piglatin_10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String pigLatin;
            pigLatin = word.substring(1) + word.charAt(0) + "a";
            System.out.println("Pig Latin : " + pigLatin);
    }
}
