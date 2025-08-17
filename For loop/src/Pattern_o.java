public class Pattern_o
{
    public static void main(String[] args) {
        int f = 0;
        for (int i = 5; i >= 1; i--)
        {
            for (int k = 1; k <= f; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
            f++;
        }
    }
}
