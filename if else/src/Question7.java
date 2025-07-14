import java.util.*;
public class Question7
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int sqr;
        double sqrroot;
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (n%2==0) {
            sqr = n*n;
            System.out.println(sqr);
        }
        else {
            sqrroot = Math.pow(n,1/2.0);
            System.out.println(sqrroot);
        }
    }
}
