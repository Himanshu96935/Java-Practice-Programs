public class FibonacciSeries_Q37
{
    public static void main(String[] args) {
        int i, a = 0, b = 1, c;
        for (i = 1; i <= 20; i++)
        {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
