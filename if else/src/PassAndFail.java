import java.util.*;
public class PassAndFail
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter marks out of 800:");
        int marks = sc.nextInt();
        if(marks > (50/100.0)*800)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
