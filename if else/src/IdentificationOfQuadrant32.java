import java.util.*;
public class IdentificationOfQuadrant32
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the x-coordinate");
        int x = sc.nextInt();

        System.out.println("enter the y-coordinate");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + " , " + y +") lies in first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The point ("+ x +") , ("+ y +") lies in second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The point ("+ x +") , ("+ y +") lies in third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The point ("+ x +"),("+ y +") lies in fourth quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("The point ("+ x +"),("+ y +") lies at the origin");
        } else if (x == 0) {
            System.out.println("The point ("+ x +"),("+ y +") lies on y-axis");
        } else if (y == 0) {
            System.out.println("The point ("+ x +"),("+ y +") lies on x-axis");
        }
    }
}
