public class Ugly_Number
{
    public static boolean ugly_check(int n)
    {
        int x[]=Functions.prime_factors(n);
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==2 || x[i]==3 || x[i]==5)
            continue;
            else 
            return false;
        }
        return true;
    }
}