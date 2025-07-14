import java.util.*;
public class ReverseFourDigitNumber36
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a four digit number");
        int n = sc.nextInt();

        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;
        int d =  n/1000;

        int reverse = (a*1000) + (b*100) + (c*10) + d;
        System.out.println("REVERSE = "+reverse);

    }
}
