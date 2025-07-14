import java.util.*;
public class AscendingOrder16
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        System.out.println("enter 3rd number:");
        int c = sc.nextInt();

        int smallest , middle , biggest;

        if (a <= b && a <= c)
        {
            smallest = a;
            if (b<=c) {
                middle = b;
                biggest = c;
            }
            else {
                middle = c;
                biggest = b;
            }
        }
        else if (b <= a && b <=c)
        {
            smallest = b;
            if (a<=c) {
                middle = a;
                biggest= c;
            }
            else {
                middle = c;
                biggest = a;
            }
        }
        else
        {
            smallest = c;
            if (b<=a) {
                middle = b;
                biggest = a;
            }
            else {
                middle = a;
                biggest = b;
            }
        }
        System.out.println("Ascending order:" + smallest + "<" + middle + "<" + biggest);

    }
}
