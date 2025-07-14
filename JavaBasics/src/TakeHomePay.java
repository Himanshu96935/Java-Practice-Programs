import java.util.*;
public class TakeHomePay
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int BS;
        double DA , HRA , GP , PF , IT , Deduction , THP;
        System.out.println("enter the BASIC SALARY:");
        BS = sc.nextInt();
        DA = (98.0/100) * BS;
        HRA = 20.0/100 * (BS+DA);
        GP = BS + HRA +DA;
        PF = 8.33/100 * (BS+DA);
        IT = 20.0/100 * GP;
        Deduction = PF + IT;
        THP = GP - Deduction;
        System.out.println("TAKE HOME PAY of a person =" +THP);
    }
}
