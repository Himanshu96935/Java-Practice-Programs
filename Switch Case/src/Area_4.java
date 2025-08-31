import java.util.*;
public class Area_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number (1 - Area of Square, 2 - Area of rectangle, 3 - Area of triangle : )");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Enter side of Square:");
                double side = sc.nextDouble();
                System.out.println("Area of Square = " + (side * side));
                break;
            case 2:
                System.out.println("Enter length of rectangle:");
                double length = sc.nextDouble();
                System.out.println("Enter breadth of rectangle:");
                double breadth = sc.nextDouble();
                System.out.println("Area of rectangle = " + (length * breadth));
                break;
            case 3:
                System.out.println("Enter base of triangle:");
                double base = sc.nextDouble();
                System.out.println("Enter height of triangle:");
                double height = sc.nextDouble();
                System.out.println("Area of triangle = " + (0.5 * base * height));
                break;
            default:
                System.out.println("Wrong choice entered");
        }
    }
}
