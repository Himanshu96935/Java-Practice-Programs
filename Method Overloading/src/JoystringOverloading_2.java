public class JoystringOverloading_2
{
    public static void main(String[] args) {

        Joystring("TECHNALAGY", 'A', 'O');
        Joystring("Cloud computing means Internet based computing");
        Joystring("COMMON WEALTH", "GAMES");
    }

    // 1ST METHOD to replace charcter in a string:
    public static void Joystring(String s, char ch1, char ch2)
    {
        String result = s.replace(ch1, ch2);
        System.out.println(result);
    }

    // 2nd method :
    public static void Joystring(String s)
    {
        int firstIndex = s.indexOf(' ');
        int lastIndex = s.lastIndexOf(' ');
        System.out.println("First Index = " + firstIndex);
        System.out.println("Last Index = " + lastIndex);
    }

    // 3rd method:
    public static void Joystring(String s1, String s2)
    {
        String result = s1 + " " + s2;
        System.out.println(result);
    }
}
