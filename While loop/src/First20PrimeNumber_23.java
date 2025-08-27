public class First20PrimeNumber_23
{
    public static void main(String[] args) {

        int count = 0;
        int num = 2;
        System.out.println("First 20 Prime Numbers are : ");
        while (count < 20)
        {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++)
            {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                count++;

            }
            num++;
        }
    }
}
