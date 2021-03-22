import java.util.*;
public class Functions
{
    public int factorial(int a)
    {
        int p=1;
        for(int i=1;i<=a;i++)
        p*=i;
        return p;
    }
    public int reverse(int n)
    {
        int sum=0, r=0;
        while(n>0)
        {    
            r=n%10; 
            sum=(sum*10)+r;    
            n=n/10;    
        }
        return sum;
    }
    public int digit_sum(int n)
    {
        int sum=0, r=0;
        while(n>0)
        {    
            r=n%10; 
            sum+=r;    
            n=n/10;    
        }
        return sum;
    }
    public int number_of_digits(int n)
    {
        int length = 0;  
        while(n != 0)
        {  
            length++;  
            n = n/10;  
        }  
        return length;
    }
}