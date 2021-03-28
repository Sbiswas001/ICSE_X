import java.math.*;
public class Lychrel_Number
{
    public boolean lychrel_check(int n)
    {
        Functions ob1 = new Functions();
        Palindrome_Number ob2 = new Palindrome_Number();
        BigInteger num = new BigInteger("0");
        num=BigInteger.valueOf(n);
        for(int i=1;i<=500;i++)
        {
            BigInteger x=ob1.reverse(num);
            System.out.println(x.toString());
            BigInteger sum=num.add(x);
            System.out.println(sum.toString());
            if(ob2.palindrome_check(sum))
            return false;
            num=sum;
        }
        return true;
    }
}