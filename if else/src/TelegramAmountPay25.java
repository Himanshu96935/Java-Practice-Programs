import java.util.*;
public class TelegramAmountPay25
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of words : ");
        int words = sc.nextInt();
        sc.nextLine();

        System.out.println("enter telegram services:ordinary/express/electronic");
        String telegramService = sc.nextLine().toLowerCase();

        double pay;

        if (words <= 25) {
            pay = 20;
        } else {
            pay = 20 + (words - 22) * 2;
        }

        if (telegramService.equals("ordinary")) {
            System.out.println("total pay = " + pay);
        } else if (telegramService.equals("express")) {
            System.out.println("toatal pay = " + (2 * pay));
        } else {
            System.out.println("total pay = " + 4 * pay);
        }
    }
}
