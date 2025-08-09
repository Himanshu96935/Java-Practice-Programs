import java.util.*;
public class FactorialOfBiggestNumber_Q59
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                int biggest = 0;

                for (int i = 1; i <= 1000; i++) {
                    int n = sc.nextInt();
                    if (n > biggest) {
                        biggest = n;
                    }
                }

                long fact = 1;
                for (int i = 1; i <= biggest; i++) {
                    fact *= i;
                }

                System.out.println("Factorial of the biggest number : " + fact);
            }
}
