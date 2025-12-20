import java.util.*;
public class MarksPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int marks[] = new int [100];

        System.out.println("enter marks of phy:");
        marks[0] = sc.nextInt();
        System.out.println("enter marks of chem:");
        marks[1] = sc.nextInt();
        System.out.println("enter marks of maths:");
        marks[2] = sc.nextInt();

        System.out.println("Phy = " + marks[0]);
        System.out.println("chem = " + marks[1]);
        System.out.println("maths = " + marks[2]);

    }
}
