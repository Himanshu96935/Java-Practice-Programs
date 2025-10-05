import java.util.*;
public class EvenOddCharactersInString_24
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        int oddCount = 0, evenCount = 0;

        for (int i = 0; i <s.length(); i++)
        {
            if ( (int)s.charAt(i) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even characters = " + evenCount);
        System.out.println("Number of odd characters = " + oddCount);
    }
}
