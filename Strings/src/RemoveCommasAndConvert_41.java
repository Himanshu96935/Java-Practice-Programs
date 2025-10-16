import java.util.*;
public class RemoveCommasAndConvert_41
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number with commas:");
        String s = sc.nextLine();

        //removing all commas:
        String noCommas = s.replace("," , "");

        //converting to integer:
        int num = Integer.parseInt(noCommas);

        System.out.println("Number without commas: " + num);
    }
}
