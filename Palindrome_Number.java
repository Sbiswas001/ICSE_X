public class Palindrome_Number
{ 
    public boolean pallindrome_check(int n)
    {  
        Functions ob = new Functions();
        if(n==ob.reverse(n))    
        return true;  
        return false;   
    }  
}  