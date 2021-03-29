public class Special_Number
{
    public static boolean special_check(int n)
    {
        int sum=0, r=0, num=n;
        while(n>0)
        {    
            r=n%10; 
            sum+=Functions.factorial(r);    
            n=n/10;    
        }
        if(sum==num)
        return true;
        return false;
    }
}