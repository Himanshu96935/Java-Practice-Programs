import java.util.*;
public class BiggestSmallestPrime_Q60 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 20 numbers : ");

        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= 20; i++) {
            int n = sc.nextInt();

            if (n > biggest) {
                biggest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
        }

        int countBig = 0;
        for (int i = 1; i <= biggest; i++) {
            if (biggest % i == 0) {
                countBig++;
            }
        }

        int countSmall = 0;
        for (int i = 1; i <= smallest; i++) {
            if (smallest % i == 0) {
                countSmall++;
            }
        }

        if (countBig == 2) {
            System.out.println("Biggest number = " + biggest + " is prime");
        } else {
            System.out.println("Biggest number = " + biggest + " is not prime");
        }

        if (countSmall == 2) {
            System.out.println("Smallest number = " + smallest + " is prime");
        } else {
            System.out.println("Smallest number = " + smallest + " is not prime");
        }
    }
}