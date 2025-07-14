import java.util.*;
public class Conversion24
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int meters,cm,totalcm;
        double inch,feet;
        System.out.println("enter the length in meter: ");
        meters = sc.nextInt();
        System.out.println("enter the length in centimeter");
        cm = sc.nextInt();
        totalcm = (meters*100)+cm;
        inch = totalcm/2.54;
        feet = inch/12;
        System.out.println("Equivalent length in feet="+feet+"ft");
    }
}
