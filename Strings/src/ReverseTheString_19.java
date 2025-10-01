import java.util.*;
public class ReverseTheString_19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the sentence:");
        String s = sc.nextLine();

        int end = s.length();

        for (int i = s.length()-1; i >= 0; i--)
        {
            if (s.charAt(i) == ' ')
            {
                System.out.print(s.substring(i+1,end) + " ");
                end = i;
            }
        }
        System.out.print(s.substring(0,end));
    }
}
