import java.util.*;
public class MarksPercentage11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        double m1,m2,m3,m4,m5,total,percentage;
        System.out.println("enter the marks in 1st subject");
        m1 = sc.nextDouble();
        System.out.println("enter the marks in 2nd subject");
        m2 = sc.nextDouble();
        System.out.println("enter the marks in 3rd subject");
        m3 = sc.nextDouble();
        System.out.println("enter the marks in 4th subject");
        m4 = sc.nextDouble();
        System.out.println("enter the marks in 5th subject");
        m5 = sc.nextDouble();
        total = m1+m2+m3+m4+m5;
        percentage = (total/500.0)*100 ;
        System.out.println("Total percentage gained = "+percentage);

    }
}
