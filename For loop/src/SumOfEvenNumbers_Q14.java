public class SumOfEvenNumbers_Q14
{
    public static void main(String[] args) {
        int s = 0, i;
        for (i = 2; i <= 20; i+= 2)
        {
            s = s + i;
        }
        System.out.println("Sum of even numbers from 1 to 20 = " + s);
    }
}
