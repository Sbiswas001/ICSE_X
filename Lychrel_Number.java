import java.math.*;
public class Lychrel_Number
{
    public boolean lychrel_check(BigInteger n)
    {
        BigInteger num = new BigInteger("0");
        num=n;
        for(int i=1;i<=500;i++)
        {
            BigInteger x=Functions.reverse(num);
            BigInteger sum=num.add(x);
            if(Palindrome_Number.palindrome_check(sum))
                return false;
            num=sum;
        }
        return true;
    }
}