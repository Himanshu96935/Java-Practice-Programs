public class Pattern_Q73h
{
    public static void main(String[] args) {

        int num = 1;
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%-3d", num);
                num++;
            }
            System.out.println();
        }
    }
}
