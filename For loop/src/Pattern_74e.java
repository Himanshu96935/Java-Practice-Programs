public class Pattern_74e
{
    public static void main(String[] args) {
        int c = 1;
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++)
            {
                System.out.print(c);
                c++;
                if (c == 6) {
                    c = 1;
                }
            }
            System.out.println();
        }
    }
}
