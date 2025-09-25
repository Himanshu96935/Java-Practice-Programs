import java.util.*;
public class PatternPrintOfName_6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(name.charAt(i));
        }
    }
}
