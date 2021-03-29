public class Spy_Number
{
    public static boolean spy_check(int num)
    {
        if(Functions.digit_sum(num)==Functions.digit_product(num))
            return true;
        return false;
    }
}