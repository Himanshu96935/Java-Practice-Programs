import java.util.*;
public class CountA
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = sc.nextLine();

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == 'a' || x == 'A') {
                c++;
            }
        }
        System.out.println("No. of A or a = " + c);
    }
}
