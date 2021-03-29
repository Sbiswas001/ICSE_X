public class Prime_Palindrome_Number
{
    public static boolean prime_palindrome_check(int n)
    {
        if(Prime_Number.prime_check(n) && Palindrome_Number.palindrome_check(n))
            return true;
        return false;
    }
}