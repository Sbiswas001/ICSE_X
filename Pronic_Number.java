public class Pronic_Number
{
    public boolean pronic_check(int a)
    {
        int k=0;
        for(int i=0;i<=a;i++)
        {
            if(i*(i+1)==a)
            {
                k=1;
                break;
            }
        }
        if(k==1)
            return true;
        return false;
    }
}