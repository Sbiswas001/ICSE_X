public class ISBN
{
    public boolean isbn_check(long n)
    {
        Functions ob1 = new Functions();
        long x[]=ob1.digit_array(n);
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