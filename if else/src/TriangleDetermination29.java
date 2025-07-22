import java.util.*;
public class TriangleDetermination29
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st angles of a triangle: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd angle of a triangle: ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd angle of a triangle: ");
        int c = sc.nextInt();

        // checking if it a valid triangle
        if (a + b + c == 180 && a >0 && b > 0 && c > 0) {
            //checking type of triangle:
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Right angled triangle");
            } else if (a > 90 || b > 90 || c > 90) {
                System.out.println("Obtuse angled triangle");
            } else {
                System.out.println("Acute angled triangle");
            }
        }
        else {
            System.out.println("Invalid triangle(sum of angles not equals to 180 )");
        }

    }
}
