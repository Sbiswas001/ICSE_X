public class Neon_Number
{
    public boolean neon_check(int n)
    {
        Functions ob = new Functions();
        if(n==ob.digit_sum(n*n))
            return true;
        return false;
    }
}