public class Pattern_s
{
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(c);
                c++;
                if (c == 4) {
                    c = 1;
                }
            }
            System.out.println();
        }
    }
}
