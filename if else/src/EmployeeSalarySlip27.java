import java.util.*;
public class EmployeeSalarySlip27
{
    public static void main (String args[])
    {
        Scanner sc  = new Scanner (System.in);

        System.out.println("Enter Basic Salary: ");
        double bs = sc.nextDouble();

        double da = 0 , hra = 0 , net = 0;

        if (bs >= 15000) {
            da = 0.75 * bs;
            hra = 0.30 *bs;
            System.out.println("Grade I");
        }
        else if (bs >= 10000 && bs < 15000) {
            da = 0.75 * bs;
            hra = 0.25 * bs;
            System.out.println("Grade II");
        } else if (bs >= 5000 && bs < 10000) {
            da = 0.60 * bs;
            hra = 0.20 * bs;
            System.out.println("Grade III");
        }
        else {
            da = 0.50 * bs;
            hra = 0.20 * bs;
            System.out.println("Grade IV");
        }

        net = bs + da + hra;

        System.out.println("Basic Salary = Rs" + bs);
        System.out.println("DA = Rs" + da);
        System.out.println("HRA = Rs" + hra);
        System.out.println("Net Salary = Rs" + net);

    }
}
