public class Decimalseries27c
{
    public static void main(String[] args) {
        double num = 0.3;
        for (int i = 1; i <= 6; i++)
        {
            System.out.printf("%.6f,",num);
            num = num / 10;
        }
    }
}
