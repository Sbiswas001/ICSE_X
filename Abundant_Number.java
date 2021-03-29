public class Abundant_Number
{
    public static boolean abundant_check(int n)
    {
        if(n<Functions.array_sum(Functions.factors(n))-n)
            return true;
        return false;
    }
}