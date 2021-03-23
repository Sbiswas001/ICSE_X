public class Armstrong_Number
{
    public boolean armstrong_check(int n)
    {
        Functions ob1 = new Functions();
        int i=ob1.number_of_digits(n),b=n,s=0;
        while(b>0)
        {
            s=s+(int)Math.pow(b%10,i);
            b/=10;
        }
        if(s==n)
            return true;
        return false;
    }
}