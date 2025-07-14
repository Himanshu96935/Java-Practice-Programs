import java.util.*;
public class Cube17
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n;
        double sqroot1,cuberoot,sqroot2,cube;
        System.out.println("enter a number:");
        n = sc.nextInt();
        sqroot1 = Math.sqrt(n);
        cuberoot = Math.cbrt(sqroot1);
        sqroot2 = Math.sqrt(cuberoot);
        cube = Math.pow(sqroot2,3);
        System.out.println("cube of square root of cube root of square root = " +cube);

    }
}
