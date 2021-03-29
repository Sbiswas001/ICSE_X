public class Emirp_Number
{
    public static boolean emirp_check(int a)
    {
        if(Prime_Number.prime_check(a)==Prime_Number.prime_check(Functions.reverse(a))) 
            return true;
        return false;
    }
}