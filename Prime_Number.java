public class Prime_Number
{
    public boolean prime_check(int a)
    {
        int flag=0;
        if(a<2) return false;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                flag++;
                break;
            }       
        }
        if(flag==1) 
            return false;
        return true;
    }
}