public class SpyNumber
{
    public boolean spy_check(int num)
    {
        Functions ob = new Functions();
        if(ob.digit_sum(num)==ob.digit_product(num))
            return true;
        return false;
    }
}