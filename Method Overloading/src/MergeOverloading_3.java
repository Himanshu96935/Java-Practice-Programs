public class MergeOverloading_3
{
    public static void main(String[] args) {

        System.out.println(merge('a', 'b'));
        System.out.println(merge(12, 345));
        System.out.println(merge("Very","Good"));
    }

    public static String merge(char a, char b)
    {
        String result = ""+ a + b;
        return result;
    }

    public static String merge (int a, int b)
    {
        String result = "" + a + b;
        return result;
    }

    public static String merge (String a, String b)
    {
        String result = a + " " +  b;
        return result;
    }
}
