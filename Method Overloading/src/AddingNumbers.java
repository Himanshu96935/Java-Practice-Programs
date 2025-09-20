import java.util.*;
public class AddingNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter three nuumbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("sum of two numbers = " + sum(a,b));
        System.out.println("Sum of three numbers = " + sum(a,b,c));
    }

    public static int sum(int a, int b)
    {
        return a+b;
    }

    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
}
