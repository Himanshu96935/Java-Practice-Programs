public class Pattern_p
{
    public static void main(String[] args) {
        int f = 0;
        int c = 1;
        for (int i = 5; i >= 1; i--)
        {
            for (int k = 1; k <= (f*4); k++)    // As 4 is multiplied to make pattern looks good .
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%4d", c);    //printf for formatting the pattern
                c++;
            }
            System.out.println();
            f++;
        }
    }
}
