import java.math.*;
public class test
{
    public static void test()
    {
        Functions ob = new Functions();
        Palindrome_Number ob2 = new Palindrome_Number();
        System.out.println(ob2.palindrome_check(BigInteger.valueOf(424)));
        System.out.println(ob.reverse(BigInteger.valueOf(42)));
    }
}