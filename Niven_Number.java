public class Niven_Number
{
    public static boolean niven_check(int a)
    {
        if(a%Functions.digit_sum(a)==0)
        return true;
        return false;
    }
}