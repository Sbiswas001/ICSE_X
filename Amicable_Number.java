public class Amicable_Number
{
    public static boolean amicable_check(int a, int b)
    {
        int sum_a=(Functions.array_sum(Functions.factors(a)))-a;
        int sum_b=(Functions.array_sum(Functions.factors(b)))-b;
        if(sum_a==b && sum_b==a)
        return true;
        return false;
    }
}