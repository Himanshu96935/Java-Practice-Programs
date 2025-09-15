//Printing First 5 Armstrong number: **
public class ArmstrongNumber
{
    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        System.out.println("The first five armstrong numbers are:");

        while(count < 5) {
            if (isArmstrong(n)) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
    }
    public static boolean isArmstrong(int n)
    {
        int temp = n, sum = 0, digits = 0;

        //counting digits here:
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        while (temp != 0)
        {
            int d = temp % 10;
            sum += Math.pow(d,digits);
            temp /= 10;
        }
        return sum == n;
    }
}
