public class Adding
{
        public static void main(String[] args) {
            System.out.println("sum of two numbers = " + sum(3, 5));
            System.out.println("Sum of three numbers = " + sum(3.5,45.2,6.3));
        }

        public static int sum(int a, int b)
        {
            return a+b;
        }

        public static double sum(double a, double b, double c)
        {
            return a+b+c;
        }
}
