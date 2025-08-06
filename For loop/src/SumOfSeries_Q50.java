public class SumOfSeries_Q50
{
    public static void main(String[] args) {
        int s = 0;
        for (int i = 2; i <= 40; i += 2)
        {
            if (((i / 2) % 2) == 1) {
                s = s + i;
            } else {
                s = s - i;
            }
        }
        System.out.println(s);
    }
}
