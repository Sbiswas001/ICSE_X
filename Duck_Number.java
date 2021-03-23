public class Duck_Number
{
    public boolean duck_check(String num)
    {
        int n=num.length();
        for(int i=0;i<n;i++)
        {
            if(num.charAt(i) == '0') 
                return false;
        }
        return true;
    }
}