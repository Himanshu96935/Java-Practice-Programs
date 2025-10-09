import java.util.*;
public class UppercaseLowercaseMixedcaseCheck_33
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a String:");
        String s = sc.nextLine();

        int upperCount = 0, lowerCount = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {

                if (Character.isUpperCase(ch)) {
                    upperCount++;
                } else {
                    lowerCount++;
                }
            }

        }
        if (upperCount > 0 && lowerCount == 0) {
            System.out.println("All letters in Strings are in Uppercase");
        } else if (lowerCount > 0 && upperCount == 0) {
            System.out.println("All letters in Strings are in Lowercase");
        } else if (lowerCount > 0 && upperCount > 0){
            System.out.println("All letters in Strings are in Mixedcase");
        } else {
            System.out.println("No letters found in String");
        }
    }
}
