public class Superugly_Number
{
    public boolean superugly_check(int list[], int num)
    {
        Functions ob = new Functions();
        int x[]=ob.prime_factors(num);
        for(int i=0;i<x.length;i++)
        {
            if(ob.array_search(list, x[i]))
            continue;
            else
            return false;
        }
        return true;
    }
}