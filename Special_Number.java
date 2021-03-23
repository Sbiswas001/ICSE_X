public class Special_Number
{
    public boolean special_check(int n)
    {
        Functions ob1 = new Functions();
        int sum=0, r=0, num=n;
        while(n>0)
        {    
            r=n%10; 
            sum+=ob1.factorial(r);    
            n=n/10;    
        }
        if(sum==num)
        return true;
        return false;
    }
}