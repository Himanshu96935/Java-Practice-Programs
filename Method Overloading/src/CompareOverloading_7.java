import java.util.*;
public class CompareOverloading_7
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        // for integer:
        System.out.println("enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        compare(a, b);
        sc.nextLine();

        // for characters:
        System.out.println("enter two characters:");
        char ch1 = sc.nextLine().charAt(0);
        char ch2 = sc.nextLine().charAt(0);
        compare(ch1, ch2);

        // for strings:
        System.out.println("enter 1st string : ");
        String s1 = sc.nextLine();
        System.out.println("enter 2nd string : ");
        String s2 = sc.nextLine();
        compare(s1, s2);
    }

    public static void compare(int a, int b)
    {
        if (a > b) {
            System.out.println("Greater integer = " + a);
        } else if (b > a) {
            System.out.println("Greatest integer = " + b);
        } else {
            System.out.println("Both integers are equal: " + a);
        }
    }

    public static void compare (char ch1, char ch2)
    {
        if (ch1 > ch2) {
            System.out.println("Higher numeric value = " + ch1);
        } else if (ch2 > ch1) {
            System.out.println("Higher numeric value = " + ch2);
        } else {
            System.out.println("Both characters have same numeric value = " + ch1);
        }
    }

    public static void compare (String s1, String s2)
    {
        if (s1.length() > s2.length()) {
            System.out.println("Longer String = " +s1);
        } else if (s2.length() > s1.length()) {
            System.out.println("Longer String = " + s2);
        } else {
            System.out.println("Both strings are of same length:" + s1);
        }
    }
}
