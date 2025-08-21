import java.util.*;
public class ArmstrongNumberCheck_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int x, cubeSum = 0;
        int original = n;
        while (n != 0)
        {
            x = n % 10;
            cubeSum += Math.pow(x,3);
            n = n / 10;
        }
        if (cubeSum == original)
        {
            System.out.println(original + " is Armstrong Number");
        } else {
            System.out.println(original + " is Not a Armstrong Number");
        }
    }
}
