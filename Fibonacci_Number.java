public class Fibonacci_Number
{
    public static boolean fibonacci_check(int n)
    {
        if(n<0) return false;
        if(Functions.isPerfectSquare(5*n*n + 4) || Functions.isPerfectSquare(5*n*n - 4))
            return true;
        return false;
    }
}