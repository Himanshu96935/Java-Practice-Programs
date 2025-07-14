import java.util.*;
public class WeightOfPerson
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter weight of a person:");
        int weight = sc.nextInt();
        if (weight>100){
            System.out.println("Overweight");
        }
        else if (weight<50){
            System.out.println("Underweight");
        }
        else {
            System.out.println("Normal Weight");
        }
    }
}
