public class ISBN
{
    public static boolean isbn_check(long n)
    {
        long x[]=Functions.digit_array(n);
        long sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=(i+1)*x[i];
        }
        if(sum%11==0)
            return true;
        return false;
    }
}