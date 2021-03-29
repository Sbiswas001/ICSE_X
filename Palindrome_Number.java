import java.math.BigInteger;

public class Palindrome_Number
{ 
    public static boolean palindrome_check(int n)
    {  
        if(n==Functions.reverse(n))    
        return true;  
        return false;  
    }  
    public static boolean palindrome_check(long n)
    {  
        if(n==Functions.reverse(n))    
        return true;  
        return false;  
    }  
    public static boolean palindrome_check(BigInteger n)
    {  
        if(n.equals(Functions.reverse(n)))    
        return true;  
        return false;  
    }  
}  