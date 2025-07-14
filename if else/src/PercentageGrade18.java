import java.util.*;
public class PercentageGrade18
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter marks in first subject:");
        int s1 = sc.nextInt();
        System.out.println("enter marks in 2nd subject:");
        int s2 = sc.nextInt();
        System.out.println("enter marks in 3rd subject:");
        int s3 = sc.nextInt();
        System.out.println("enter marks in 4th subject:");
        int s4 = sc.nextInt();
        System.out.println("enter marks in 5th subject:");
        int s5 = sc.nextInt();

        int marks = s1 + s2 + s3 +s4 +s5;
        double percentage = (marks / 500.0) * 100;

        if (percentage >= 80)
        {
            System.out.println("Percentage = " + percentage + " AND Grade = A " );
        }
        else if (percentage >= 60 &&  percentage < 80) {
            System.out.println("Percentage = " + percentage + " AND Grade = B ");
        }
        else if (percentage >= 40 && percentage < 60)
        {
            System.out.println("Percentage = " + percentage + " AND Grade = C ");
        }
        else {
            System.out.println("Percentage = " + percentage + " AND Grade = D ");
        }
    }
}
