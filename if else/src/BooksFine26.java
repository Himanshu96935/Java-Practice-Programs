import java.util.*;
public class BooksFine26
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of days");
        int days = sc.nextInt();
        
        double fine = 0;

        if (days <= 10) {
            System.out.println("Thanks for returning book on time");
        }
        else {
            if (days <=15) {
                fine = (days-10)*2;
            } else if (days <=25) {
                fine = (5 * 2) + (days - 15) * 4;
            } else {
                fine = (5 * 2) + (10 * 4) + (days - 25) * 6;
            }
            System.out.println("Fine = Rs " + fine);
        }
    }
}

