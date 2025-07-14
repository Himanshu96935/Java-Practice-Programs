import java.util.*;
public class CubeOfSumAndProduct
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int A,B,sum,product,cubeS,cubeP;
        System.out.println ("enter 1st number");
        A = sc.nextInt();
        System.out.println ("enter 2nd number");
        B = sc.nextInt();
        sum = A+B;
        product = A*B;
        cubeS = (sum*sum*sum);
        cubeP = (product*product*product);
        System.out.println("Cube of sum = "+cubeS+ "; Cube of product = " +cubeP);
    }
}
