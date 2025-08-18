public class Pattern_74h
{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int s = 1; s <= n - i; s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
