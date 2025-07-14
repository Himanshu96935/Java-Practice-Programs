import java.util.*;
public class CubeOfSquareRoot16
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner (System.in);
     int n;
     double sqroot,cube;
        System.out.println("ENTER A NUMBER:");
        n = sc.nextInt();
        sqroot = Math.sqrt(n);
        cube = Math.pow(sqroot,3);
        System.out.println("The Cube of the Square Root of a Number = " +cube);
    }
}
