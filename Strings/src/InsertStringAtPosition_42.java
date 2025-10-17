import java.util.*;
public class InsertStringAtPosition_42
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String main = sc.nextLine();

        System.out.println("Enter the string to insert:");
        String insert = sc.nextLine();

        System.out.println("Enter the position where to insert:");
        int pos = sc.nextInt();

        if (pos < 0 || pos > main.length()) {
            System.out.println("Invalid position!");
        } else {
            String result = main.substring(0, pos) + insert + main.substring(pos);
            System.out.println("Resulting string: " + result);
        }
    }
}
