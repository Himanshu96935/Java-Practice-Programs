import java.util.*;
public class Gifts_9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount spends on purchase:");
        double spends = sc.nextDouble();

        int category;
        
        if (spends <= 10000) {
            category = 1;
        } else if (spends <= 50000) {
            category = 2;
        } else if (spends <= 100000) {
            category = 3;
        } else {
            category = 4;
        }

        switch (category)
        {
            case 1:
                System.out.println("Gift : 2GB MP3 PLAYER");
                break;
            case 2:
                System.out.println("Gift : 2GB Mp3 player + 16GB PEN DRIVE");
                break;
            case 3:
                System.out.println("Gift : 2GB Mp3 player + 16GB PEN DRIVE + 320GB HDD");
                break;
            case 4:
                System.out.println("Gift : 2GB Mp3 player + 16GB PEN DRIVE + 320GB HDD + MOBILE PHONE");
                break;
            default:
                System.out.println("Invalid Amount");
        }
    }
}
