public class Abundant_Number
{
    public boolean abandunt_check(int n)
    {
        Functions ob = new Functions();
        if(n<ob.array_sum(ob.factors(n))-n)
            return true;
        return false;
    }
}