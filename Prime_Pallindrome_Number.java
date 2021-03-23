public class Prime_Pallindrome_Number
{
    public boolean armstrong_check(int n)
    {
        Palindrome_Number ob1 = new Palindrome_Number();
        Prime_Number ob2 = new Prime_Number();
        if(ob2.prime_check(n) && ob1.pallindrome_check(n))
            return true;
        return false;
    }
}