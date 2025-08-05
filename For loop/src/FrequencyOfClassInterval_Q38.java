import java.util.*;
public class FrequencyOfClassInterval_Q38
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, f1 = 0, f2 = 0, f3 = 0, f4 = 0;
        System.out.println("Enter 20 numbers:");
        for (i = 1; i <= 20; i++)
        {
            int n = sc.nextInt();
            if (n <=25) {
                f1 += 1;
            } else if (n <= 50) {
                f2 += 1;
            } else if (n <= 75) {
                f3 += 1;
            } else {
                f4 += 1;
            }
        }
        System.out.println("Frequency of 0 - 25 = " + f1);
        System.out.println("Frequency of 26 - 50 = " + f2);
        System.out.println("Frequency of 51 - 75 = " + f3);
        System.out.println("Frequency of above 75 = " + f4);

    }
}
