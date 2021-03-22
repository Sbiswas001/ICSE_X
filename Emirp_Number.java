public class Emirp_Number
{
    public boolean emirp_check(int a)
    {
        Functions ob1 = new Functions();
        Prime_Number ob2 = new Prime_Number();
        if(ob2.prime_check(a)==ob2.prime_check(ob1.reverse(a))) 
            return true;
        return false;
    }
}