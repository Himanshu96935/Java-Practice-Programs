public class FibonacciNumbers_Q57
{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 1; a <= 100; i++)
        {
            if (a > 1 && a % 2 == 0)
            {
                System.out.println(a);
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
