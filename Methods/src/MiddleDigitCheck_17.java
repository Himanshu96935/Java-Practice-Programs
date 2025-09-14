// Input 2 three digit number and check the middle digit of both numbers are same or not.

import java.util.*;
public class MiddleDigitCheck_17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two 3 digit number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(middleCheck(a, b)) {
            System.out.println("Middle digits are same");
        } else {
            System.out.println("Middle digits are not same");
        }

    }
    public static boolean middleCheck(int a, int b)
    {
        int mid_a = (a / 10) % 10;
        int mid_b = (b / 10) % 10;
        return (mid_a == mid_b);
    }
}
