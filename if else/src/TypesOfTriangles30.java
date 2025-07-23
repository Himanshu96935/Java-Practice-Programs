import java.util.Scanner;

public class TypesOfTriangles30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Check for a valid triangle
        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            }
            else if (a == b || b == c || c == a) {
                System.out.println("The triangle is Isosceles.");
            }
            else {
                System.out.println("The triangle is Scalene.");
            }
            // Check for Right-Angle using Pythagoras Theorem
            if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) {
                System.out.println("The triangle is also a Right-Angle triangle.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}
