public class Kaprekar_Number
{
    public static boolean kaprekar_check(int num)
    {
        int n=num*num;
        int f=0,l=0,sum=0;
        int count=Functions.number_of_digits(n);
        if(count%2==0)
        {
            f=n/(int)Math.pow(10,count/2);
            l=n%(int)Math.pow(10,count/2);
            sum=f+l;
        }
        else
        {
            f=n/(int)Math.pow(10,(count/2)+1);
            l=n%((int)Math.pow(10,(count/2)+1));
            sum=f+l;
        }
        if(sum==num)
            return true;
        return false;            
    }
}