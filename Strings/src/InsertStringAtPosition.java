import java.util.*;
public class InsertStringAtPosition
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string:");
        String s = sc.nextLine();

        System.out.println("Enter string to insert:");
        String Insert = sc.nextLine();

        System.out.println("enter the position where to insert:");
        int pos = sc.nextInt();

        if (pos < 0 || pos > s.length()) {
            System.out.println("Invalid position entered.");
        } else {
            String part1 = s.substring(0,pos);
            String part2 = s.substring(pos);
            String result = part1 + Insert + part2;

            System.out.println("Resulting String : " + result);
        }
    }
}
