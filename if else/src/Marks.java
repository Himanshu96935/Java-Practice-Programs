import java.util.*;
public class Marks
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter total marks out of 100:");
        int marks = sc.nextInt();
        if (marks>39) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

    }
}
