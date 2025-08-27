public class First10Armstrong_24
{
    public static void main(String[] args) {

        int num = 1;
        int count = 0;

        while (count != 10)
        {
            int temp = num;
            int s = 0;

            //counting digits:
            int digits = 0;
            int t = num;
            while (t != 0)
            {
                t = t / 10;
                digits++;
            }

            //calculate digits sum with power:
            while (temp != 0)
            {
                int x = temp % 10;
                s = s + (int)Math.pow(x,digits);
                temp = temp / 10;
            }
            if (s == num) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
