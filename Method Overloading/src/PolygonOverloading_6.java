import java.util.*;
public class PolygonOverloading_6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for square:
        System.out.println("Enter side of square:");
        int n = sc.nextInt();
        sc.nextLine();    // this extra next line added to consume the empty string that was created when we hit ENTER KEY.
        System.out.println("Enter character to fill the square:");
        char ch = sc.nextLine().charAt(0);
        polygon(n, ch);

        // for rectangle:
        System.out.println("enter length the value for x");
        int x = sc.nextInt();
        System.out.println("enter breadth the value for y");
        int y = sc.nextInt();
        polygon(x, y);

        // for filled triangle:
        System.out.println("/Filled triangle : ");
        polygon();
    }

    // Methos to print square of side n:
    public static void polygon(int n, char ch)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Methods to print rectangle of length 'x' and breadth 'y':
    public static void polygon (int x, int y)
    {
        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j<=y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Methods to print filled triangle:
    public static void polygon()
    {
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
