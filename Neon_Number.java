public class Neon_Number
{
    public static boolean neon_check(int n)
    {
        if(n==Functions.digit_sum(n*n))
            return true;
        return false;
    }
}