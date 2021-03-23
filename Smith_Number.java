public class Smith_Number
{
    public boolean smith_check(int a)
    {
        Prime_Number ob1 = new Prime_Number();
        Functions ob2 =  new Functions();
        if(ob1.prime_check(a) || a<4)
        return false;
        int factors[] = ob2.prime_factors(a);
        int n=factors.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=ob2.digit_sum(factors[i]);
        }
        if(ob2.digit_sum(a)!=sum)
        return false;
        return true;
    }
}