public class Lychrel_Number
{
    public boolean lychrel_check(int n)
    {
        Functions ob = new Functions();
        if(n==ob.digit_sum(n*n))
            return true;
        return false;
    }
}