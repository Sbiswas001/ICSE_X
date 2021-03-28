import java.math.*;
public class test
{
    public static void test()
    {
        Functions ob = new Functions();
        Palindrome_Number ob2 = new Palindrome_Number();
        Lychrel_Number ob3 = new Lychrel_Number();       
        System.out.println(ob2.palindrome_check(BigInteger.valueOf(424)));
        System.out.println(ob.reverse(BigInteger.valueOf(42)));
        System.out.println(ob3.lychrel_check(BigInteger.valueOf(1186060307891929990l)));
    }
    static void t()
    {
        char ch='t';
        char res=Character.toUpperCase(ch);
        System.out.println(res);
    }
}