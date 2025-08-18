public class Pattern_x
{
    public static void main(String[] args) {
        for (int i = 2; i <= 5; i++)
        {
            int c  = 0;
            for (int j = 1; j <= i; j++)
            {
                if (j != i) {
                    System.out.print(j);
                    c = c + j;
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
