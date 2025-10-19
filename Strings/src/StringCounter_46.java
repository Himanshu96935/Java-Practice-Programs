import java.util.*;
public class StringCounter_46
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a sentence: ");
        String s = sc.nextLine().toLowerCase();

        System.out.println("enter a string to count: ");
        String search = sc.nextLine().toLowerCase();

        int count = 0;
        int index = 0;

        //searching string in the sentence:
        while ((index = s.indexOf(search,index)) != -1)
        {
            count++;
            index = index + search.length();
        }
        System.out.println("The string : " + search + " appears " + count + " times");
    }
}
