public class ISBN
{
    public boolean isbn_check(int n)
    {
        Functions ob1 = new Functions();
        int x[]=ob1.digit_array(n);
        int sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=i*x[i];
        }
        if(sum%11==0)
            return true;
        return false;
    }
}