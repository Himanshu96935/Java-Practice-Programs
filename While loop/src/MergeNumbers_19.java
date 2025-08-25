import java.util.*;
public class MergeNumbers_19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number :");
        int num2 = sc.nextInt();

        int temp = num2;
        int count = 0;

        while (temp != 0)
        {
            count++;
            temp = temp / 10;
        }

        int mergeNum = num1 * (int)Math.pow(10,count) + num2;

        System.out.println("The merged number = " + mergeNum);
    }
}
