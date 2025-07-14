import java.util.*;
public class NumberPositiveNegativeZero
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Positive");
        }
        else if (n<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("zero");
        }
    }
}
