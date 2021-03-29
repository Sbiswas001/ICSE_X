public class Lucas_Number
{
    public static boolean lucas_check(int n)
    {
        if(n<0) return false;
        if(Functions.isPerfectSquare(5*n*n + 20) || Functions.isPerfectSquare(5*n*n - 20))
            return true;
        return false;
    }
}