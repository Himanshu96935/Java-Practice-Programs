import java.util.*;
public class CyclicRotation_43
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String s = sc.nextLine();

        String rotated = s;
        int len = s.length();

        for (int i = 0; i < len; i++) {

            rotated = rotated.substring(1) + rotated.charAt(0);

            System.out.print(rotated);

            if (i < len - 1) {
                System.out.print(",");
            }
        }
    }
}
