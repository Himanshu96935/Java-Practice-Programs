// Write a program to enter a number and print the difference between its factorial and sum of the factors.

import java.util.*;
public class Difference_Q36
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int i, s = 0;
        long f = 1;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                s += i;
            }
            f = f * i;
        }
        if (f > s) {
            System.out.println("difference between factorial and sum of factors = " + (f - s));
        } else {
            System.out.println("difference between factorial and sum of factors = " + (s - f));
        }
    }
}
