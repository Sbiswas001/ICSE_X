public class Niven_Number
{
    public boolean niven_check(int a)
    {
        Functions ob1 = new Functions();
        if(a%ob1.digit_sum(a)==0)
        return true;
        return false;
    }
}