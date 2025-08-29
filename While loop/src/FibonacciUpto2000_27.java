import java.util.*;
public class FibonacciUpto2000_27
{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " "); // Print first two numbers

        c = a + b; // First sum
        while (c <= 2000)

        {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b; // Next Fibonacci number
        }
    }

}
