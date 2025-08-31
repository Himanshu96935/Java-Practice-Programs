import java.util.*;
public class TelegramBillPay_8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter category of Telegram: (ordinary / express / electronic)");
        String category = sc.next().toLowerCase();

        System.out.println("Enter number of words in a telegram:");
        int words = sc.nextInt();

        // Calculate ordinary bill first:
        double bill;
        if (words <= 25) {
            bill = 20;
        } else {
            bill = 20 + (words - 25) * 2;
        }

        switch (category)
        {
            case "ordinary":
                break;
            case "express":
                bill = 2 * bill;
                break;
            case "electronic":
                bill = 4 * bill;
                break;
            default:
                System.out.println("Invalid category entered!");
                return;
        }

        System.out.println("Amount to pay for telegram = " + bill);
    }
}
