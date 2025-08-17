public class Pattern_t
{
    public static void main(String[] args) {
        for (int  i = 1; i <= 5; i++)
        {
            int c = 0;
            for (int j = 1; j <= i; j++)
            {
                c += i;
                System.out.printf("%3d", c);
            }
            System.out.println();
        }
    }
}
