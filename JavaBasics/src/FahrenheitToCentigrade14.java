import java.sql.SQLOutput;
import java.util.*;
public class FahrenheitToCentigrade14
{
    public static void main (String args[])
     {
        Scanner sc = new Scanner (System.in);
        float tempF,tempC;
         System.out.println(" enter the temperature in fahrenheit");
         tempF = sc.nextFloat();
         tempC = (5.0f/9)*(tempF-32);
         System.out.println("centigrade temperature = " +tempC);
     }
}
