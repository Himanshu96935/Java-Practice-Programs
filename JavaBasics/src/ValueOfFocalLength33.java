import java.util.*;
public class ValueOfFocalLength33
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the object distance:");
        int u = sc.nextInt();
        System.out.println("enter the image distance:");
        int v = sc.nextInt();

        int f = (u*v) / (v+u);
        System.out.println("Focal Length:" +f);
    }
}
