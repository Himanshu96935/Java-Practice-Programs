import java.util.*;
public class TablePrinting_Q10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to which we want to print table:");
        int n = sc.nextInt();

        System.out.println("Enter Number of times we want to print table:");
        int z = sc.nextInt();

        int i;
        for (i=1;i<=z;i++)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
