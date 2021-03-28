public class Lucas_Number
{
    public boolean lucas_check(int n)
    {
        Functions ob = new Functions();
        if(n<0) return false;
        if(ob.isPerfectSquare(5*n*n + 20) || ob.isPerfectSquare(5*n*n - 20))
            return true;
        return false;
    }
}