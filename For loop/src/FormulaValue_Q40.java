import java.util.*;
public class FormulaValue_Q40
{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        System.out.println("enter value of n:");
        int n = sc.nextInt();
        System.out.println("enter value of r:");
        int r = sc.nextInt();

        int nFact = 1, rFact = 1, nMinusRfact = 1;

        for (int i = 1; i <= n; i++)
        {
            nFact *= i;
        }

        for (int j = 1; j <= r; j++)
        {
            rFact *= j;
        }

        for (int k = 1; k <= (n - r); k++)
        {
            nMinusRfact *= k;
        }

        long result = nFact / (nMinusRfact * rFact);
        System.out.println(result);
    }
}
