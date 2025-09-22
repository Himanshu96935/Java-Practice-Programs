import java.util.*;
public class AreaOverloading_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b :");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c :");
        double c = sc.nextDouble();
        System.out.println("Enter the value for two diagonals d1 & d2 :");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Enter height : ");
        double h = sc.nextDouble();

        double areaOfScaleneTriangle = area(a,b,c);
        double areaOfTrapezium = area(a,b,h);
        double areaOfRhombus = area(d1,d2);

        System.out.println("Area of Scalene triangle = " + areaOfScaleneTriangle);
        System.out.println("Area of Trapezium = " + areaOfTrapezium);
        System.out.println("Area of Rhombus = " + areaOfRhombus);
    }

    // methods to calculate area of Scalene Triangle:
    public static double area(double a, double b, double c)
    {
        double s = (a + b + c) / 2;
        double scaleneArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return scaleneArea;
    }

    // methods to calculate area of Trapezium:
    public static double area(int a, int b, int height)
    {
        return (1/2.0) * height * (a + b);
    }

    // methods to calculate area of Rhombus:
    public static double area (double diagona1, double diagonal2)
    {
        return (1/2.0) * (diagona1 * diagonal2);
    }
}
