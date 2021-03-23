public class Disarium_Number
{
    public boolean disarium_check(int a)
    {
        int sum = 0, rem = 0, n=a;  
        Functions ob = new Functions();
        int len = ob.number_of_digits(a);    
        while(a > 0)
        {  
            rem = a%10;  
            sum = sum + (int)Math.pow(rem,len);  
            a = a/10;  
            len--;
        }
        if(sum==n)
            return true;
        return false;
    }
}