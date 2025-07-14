import java.util.*;
public class Area30
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        double s,AREA,Rc,Ri,ArIns,ArCir;
        System.out.println("enter the side of a triangle:");
        a = sc.nextInt();
        System.out.println("enter the side of a triangle:");
        b = sc.nextInt();
        System.out.println("enter the side of a triangle:");
        c = sc.nextInt();
        s = (a+b+c)/2.0;
        AREA = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        Ri = AREA/s;
        Rc = (a*b*c)/(4*AREA);
        ArIns = 3.14*Ri*Ri;
        ArCir = 3.14*Rc*Rc;
        System.out.println("AREA OF TRIANGLE =" +AREA);
        System.out.println("AREA OF INSCRIBED CIRCLE =" +ArIns);
        System.out.println("AREA OF CIRCUMSCRIBED CIRCLE =" +ArCir);
    }
}
