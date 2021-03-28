import java.math.BigInteger;

public class Palindrome_Number
{ 
    public boolean palindrome_check(int n)
    {  
        Functions ob = new Functions();
        if(n==ob.reverse(n))    
        return true;  
        return false;  
    }  
    public boolean palindrome_check(long n)
    {  
        Functions ob = new Functions();
        if(n==ob.reverse(n))    
        return true;  
        return false;  
    }  
    public boolean palindrome_check(BigInteger n)
    {  
        Functions ob = new Functions();
        if(n==ob.reverse(n))    
        return true;  
        return false;  
    }  
}  