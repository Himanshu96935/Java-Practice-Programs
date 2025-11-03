import java.util.*;
public class CountParticularNumber_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[50];
        int count = 0;

        for (int i = 0; i < 50; i++)
        {
            System.out.println("Enter  numbers");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to count:");
        int n = sc.nextInt();

        for (int i = 0; i < 50; i++)
        {
            if (arr[i] == n)
                count++;
        }

        System.out.println(n + " appears " + count + " times") ;
    }
}
