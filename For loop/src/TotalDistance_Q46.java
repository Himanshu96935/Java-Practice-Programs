import java.util.*;
public class TotalDistance_Q46
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int speed = 20;
        int totalDistance = 0;
        for (int i = 1; i <= 8; i++)
        {
            totalDistance += speed;
            speed -= 2;
        }
        System.out.println("Total Distance = " + totalDistance + "m");
    }
}
