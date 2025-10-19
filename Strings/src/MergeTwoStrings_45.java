import java.util.*;
public class MergeTwoStrings_45
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter 1st string:");
        String s1 = sc.nextLine();

        System.out.println("enter 2nd string:");
        String s2 = sc.nextLine();

        String merge = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (merge.indexOf(ch) == -1) {
                merge += ch;
            }
        }

        for (int i = 0; i < s2.length(); i++)
        {
            char ch = s2.charAt(i);
            if (merge.indexOf(ch) == -1) {
                merge += ch;
            }
        }
        System.out.println("Merged Unique String: " + merge);
    }
}
