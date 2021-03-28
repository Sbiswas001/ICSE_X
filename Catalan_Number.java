public class Catalan_Number
{
    public boolean catalan_check(int n)
    {
        Functions ob = new Functions();
        if(n==ob.digit_sum(n*n))
            return true;
        return false;
    }
}