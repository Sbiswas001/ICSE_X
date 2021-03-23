public class Neon_Number
{
    public boolean neon_check(int n)
    {
        int a=n*n,s=0;
        while(a>0)
        {
            s+=a%10;
            a/=10;
        }
        if(s==n)
            return true;
        return false;
    }
}