public class Fermat_Number
{
    public static boolean fermat_check(int n)
    {
        double x=Math.log(Math.log((double)n-1)/Math.log(2))/Math.log(2);
        if(x==(int)x)
            return true;
        return false;
    }
}