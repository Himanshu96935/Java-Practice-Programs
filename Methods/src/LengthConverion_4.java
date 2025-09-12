// Input length in feet and inches and print its equivalent length into meters

import java.util.*;
public class LengthConverion_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length in Feet:");
        int feet = sc.nextInt();
        System.out.println("Enter length in Inches:");
        int inches = sc.nextInt();

        double meters = toMeters(feet, inches);
        System.out.println("Equivalent length in meters = " + meters);
    }

    public static double toMeters(int feet, int inches)
    {
        int totalInches = (feet * 12) + inches;
        return totalInches * 0.0254; // As we know 1m = 100cm, since 1cm = 1/100m
    }
}
