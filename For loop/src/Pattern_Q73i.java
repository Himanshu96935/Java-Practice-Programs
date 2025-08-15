public class Pattern_Q73i
{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++)
        {
            for (int k = 1; k <= n - i; k++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
