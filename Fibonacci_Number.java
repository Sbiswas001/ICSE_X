public class Fibonacci_Number
{
    public boolean fibonacci_check(int n)
    {
        Functions ob = new Functions();
        if(n<0) return false;
        if(ob.isPerfectSquare(5*n*n + 4) || ob.isPerfectSquare(5*n*n - 4))
            return true;
        return false;
    }
}