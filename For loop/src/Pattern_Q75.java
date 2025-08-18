public class Pattern_Q75
{
    public static void main(String[] args) {
        int left = 1;
        int right = 8;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < i * 2; j++)
            {
                System.out.print(" ");
            }
            System.out.println(left + " - " + right);
            left++;
            right--;
        }
    }
}
