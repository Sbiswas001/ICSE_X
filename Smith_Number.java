public class Smith_Number
{
    public static boolean smith_check(int a)
    {
        if(Prime_Number.prime_check(a) || a<4)
        return false;
        int factors[] = Functions.prime_factors(a);
        int n=factors.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Functions.digit_sum(factors[i]);
        }
        if(Functions.digit_sum(a)!=sum)
        return false;
        return true;
    }
}