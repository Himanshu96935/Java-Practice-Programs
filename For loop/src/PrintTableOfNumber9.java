import java.util.*;
public class PrintTableOfNumber9
{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number to which you want to print table");
        int n = sc.nextInt();

        int i;
        for (i=1;i<=10;i++)
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
