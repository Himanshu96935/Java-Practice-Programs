import java.sql.SQLOutput;
import java.util.*;
public class TotalValueRepresentationInRupees38
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter no of 50 paisa:");
        int fifty = sc.nextInt();
        System.out.println("Enter no of 25 paisa:");
        int twenty5 = sc.nextInt();
        System.out.println("enter no of 20 paisa:");
        int twenty = sc.nextInt();
        System.out.println("Enter no of 10 paisa:");
        int ten = sc.nextInt();
        System.out.println("enter no of 5 paisa:");
        int five = sc.nextInt();

        double amount = (fifty*0.50) + (twenty5*0.25) + (twenty*0.20) + (ten*0.10) + (five*0.05);
        System.out.println("Total Amount In Rupees = "+amount);

    }
}
