import java.util.*;
public class TablePrinter_8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while (c == 1)
        {
            System.out.println("Enter number to print Table:");
            int n = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n*i);
            }
            System.out.println("Enter 1 to continue printing Table any other to Terminate");
            c = sc.nextInt();
        }
    }
}
