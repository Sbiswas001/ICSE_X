public class Superugly_Number
{
    public static boolean superugly_check(int list[], int num)
    {
        int x[]=Functions.prime_factors(num);
        for(int i=0;i<x.length;i++)
        {
            if(Functions.array_search(list, x[i]))
            continue;
            else
            return false;
        }
        return true;
    }
}