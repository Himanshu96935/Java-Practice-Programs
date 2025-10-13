import java.util.*;
public class HammingDistance_37
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st string:");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();

        int distance = 0;

        if (s1.length() != s2.length()) {
            System.out.println("String length differ: provide string of same length");
            return;
        } else {
            for (int i = 0; i < s1.length(); i++)
            {
                if (s1.charAt(i) != s2.charAt(i)) {
                    distance++;
                }
            }
            System.out.println("Hamming Distance = " + distance);
        }
    }
}
