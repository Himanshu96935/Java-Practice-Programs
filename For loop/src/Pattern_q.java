public class Pattern_q
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            int c = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
