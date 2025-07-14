import java.util.*;
public class SmallestNumber9
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n1 , n2 , n3;
        System.out.println("enter a no:");
        n1 = sc.nextInt();
        System.out.println("enter a 2nd no:");
        n2 = sc.nextInt();
        System.out.println("enter 3rd no:");
        n3 = sc.nextInt();
        if (n1<n2 && n1<n3) {
            System.out.println("smallest = " + n1);
        } else if (n2<n3) {
            System.out.println("smallest = " + n2);
        }
        else {
            System.out.println("smallest=" +n3);
        }
    }
}
