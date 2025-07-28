public class OddNumbers3
{
    public static void main (String args[])
    {
        int i;
        for (i = 10; i <= 20; i = i +1)
        {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

/* Here we can also use this code : in this code we skip the even numbers directly and start from firs odd number.
for (int i = 11; i <= 19; i += 2) {
    System.out.println(i);
}
 */