import java.util.*;
public class SquareAndCube
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num,sqr,cube;
        System.out.println ("enter a number");
        num = sc.nextInt();
        sqr = num*num;
        cube = num*num*num;
        System.out.println ("The square ="+ sqr + " The cube =" +cube);
    }
}
