import java.util.*;
public class FibonacciCheck_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        c = a + b;
        if (n == 0 || n == 1) {
            System.out.println(n + " is a Fibonacci Number.");
        } else {
            while (c <= n) {
                if (c == n) {
                    System.out.println(n + " is a Fibonacci Number.");
                    return; // exit program
                }
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println(n + " is not a Fibonacci Number.");
        }
    }
}
