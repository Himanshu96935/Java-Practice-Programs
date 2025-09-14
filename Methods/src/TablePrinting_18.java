// table of N upto Z times.
import java.util.*;
public class TablePrinting_18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of N (to which you want to print table)");
        int N = sc.nextInt();
        System.out.println("Enter the value for Z (upto where you want to print table)");
        int Z = sc.nextInt();
        tablePrint(N, Z);
    }
    public static void tablePrint(int n, int z)
    {
        for(int i = 1; i <= z; i++) {
            System.out.println(n * i);
        }
    }
}
