public class Pattern_Q73L
{
    public static void main(String[] args) {

        int n = 5;
        int num = 1;

        for (int i = 1; i <= 5; i++)
        {
            // for printin space:
            for (int j = 1; j <= (n-i) * 3; j++) {
                System.out.print(" ");
            }
            // For printing numbers:
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2d ",num);
                num++;
            }
            System.out.println();
        }
    }
}
