import java.util.*;
import java.math.*;
import java.lang.*;
public class Number_Names
{
    public static boolean tech_check(int n)  
    {  
        int num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;  
        num = n;  
        while (num > 0)  
        {     
            digits++;  
            num = num / 10;  
        }  
        if (digits % 2 == 0)  
        {  
            num = n;  
            firstHalf = num % (int) Math.pow(10, digits / 2);   
            secondHalf = num / (int) Math.pow(10, digits / 2);    
            squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);    
            if (n == squareOfSum)  
            return true;   
            else  
            return false;   
        }  
        return false;  
    } 
    public static boolean prime_check(int a)
    {
        int flag=0;
        if(a<2) return false;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                flag++;
                break;
            }       
        }
        if(flag==1) 
            return false;
        return true;
    }
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
    public static boolean disarium_check(int a)
    {
        int sum = 0, rem = 0, n=a;  
        int len = Functions.number_of_digits(a);    
        while(a > 0)
        {  
            rem = a%10;  
            sum = sum + (int)Math.pow(rem,len);  
            a = a/10;  
            len--;
        }
        if(sum==n)
            return true;
        return false;
    }
    public static boolean niven_check(int a)
    {
        if(a%Functions.digit_sum(a)==0)
        return true;
        return false;
    }
    public static boolean emirp_check(int a)
    {
        if(Number_Names.prime_check(a)==Number_Names.prime_check(Functions.reverse(a))) 
            return true;
        return false;
    }
    public static boolean pronic_check(int a)
    {
        int k=0;
        for(int i=0;i<=a;i++)
        {
            if(i*(i+1)==a)
            {
                k=1;
                break;
            }
        }
        if(k==1)
            return true;
        return false;
    }
    public static boolean automorphic_check(int num)
    {
        int square = num * num;   
        while (num > 0)   
        {   
            if (num % 10 != square % 10)   
 
            return false;   
            num = num/10;   
            square = square/10;   
        }   
        return true;   
    }   
    public static boolean kaprekar_check(int num)
    {
        int n=num*num;
        int f=0,l=0,sum=0;
        int count=Functions.number_of_digits(n);
        if(count%2==0)
        {
            f=n/(int)Math.pow(10,count/2);
            l=n%(int)Math.pow(10,count/2);
            sum=f+l;
        }
        else
        {
            f=n/(int)Math.pow(10,(count/2)+1);
            l=n%((int)Math.pow(10,(count/2)+1));
            sum=f+l;
        }
        if(sum==num)
            return true;
        return false;            
    }
    public static boolean special_check(int n)
    {
        int sum=0, r=0, num=n;
        while(n>0)
        {    
            r=n%10; 
            sum+=Functions.factorial(r);    
            n=n/10;    
        }
        if(sum==num)
        return true;
        return false;
    }
    public static boolean lucas_check(int n)
    {
        if(n<0) return false;
        if(Functions.isPerfectSquare(5*n*n + 20) || Functions.isPerfectSquare(5*n*n - 20))
            return true;
        return false;
    }
    public static boolean smith_check(int a)
    {
        if(Number_Names.prime_check(a) || a<4)
        return false;
        int factors[] = Functions.prime_factors(a);
        int n=factors.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Functions.digit_sum(factors[i]);
        }
        if(Functions.digit_sum(a)!=sum)
        return false;
        return true;
    }
    public static boolean armstrong_check(int n)
    {
        int i=Functions.number_of_digits(n),b=n,s=0;
        while(b>0)
        {
            s=s+(int)Math.pow(b%10,i);
            b/=10;
        }
        if(s==n)
            return true;
        return false;
    }
    public static boolean fibonacci_check(int n)
    {
        if(n<0) return false;
        if(Functions.isPerfectSquare(5*n*n + 4) || Functions.isPerfectSquare(5*n*n - 4))
            return true;
        return false;
    }
    public static boolean circular_prime_check(int a)
    {
        int count=Functions.number_of_digits(a);
        int num=a, k=a;
        for(int i=1;i<=count;i++)
        {
            int x=k%10;
            if(x==0 || x==2 || x==4 || x==6 || x==8 || x==5)
            return false;
            k/=10;
        }
        while(Number_Names.prime_check(a))
        {
            int rem = num % 10;
            int div = num / 10;
            num = (int)((Math.pow(10, count - 1)) * rem) + div; 
            if (num == a)
            return true;
        }
        return false;
    }
    public static boolean prime_palindrome_check(int n)
    {
        if(Number_Names.prime_check(n) && Number_Names.palindrome_check(n))
            return true;
        return false;
    }
    public static boolean isbn_check(long n)
    {
        long x[]=Functions.digit_array(n);
        long sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=(i+1)*x[i];
        }
        if(sum%11==0)
            return true;
        return false;
    }
    public static boolean abundant_check(int n)
    {
        if(n<Functions.array_sum(Functions.factors(n))-n)
            return true;
        return false;
    }
    public static boolean fermat_check(int n)
    {
        double x=Math.log(Math.log((double)n-1)/Math.log(2))/Math.log(2);
        if(x==(int)x)
            return true;
        return false;
    }
    public static boolean ugly_check(int n)
    {
        int x[]=Functions.prime_factors(n);
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==2 || x[i]==3 || x[i]==5)
            continue;
            else 
            return false;
        }
        return true;
    }
    public static boolean neon_check(int n)
    {
        if(n==Functions.digit_sum(n*n))
            return true;
        return false;
    }
    public static boolean spy_check(int num)
    {
        if(Functions.digit_sum(num)==Functions.digit_product(num))
            return true;
        return false;
    }
    public static boolean happy_check(int n)
    {  
        long num=n, sum=0;
        do
        {
            long r=0;
            sum=0;
            while(num>0)
            {    
                r=num%10; 
                sum+=r*r;    
                num=num/10;    
            }
            num=sum;        
        }while(sum>=10);
        if(sum==1)
            return true;
        return false;
    }  
    public static boolean duck_check(String num)
    {
        int n=num.length();
        for(int i=0;i<n;i++)
        {
            if(num.charAt(i) == '0') 
                return false;
        }
        return true;
    }
    public static boolean amicable_check(int a, int b)
    {
        int sum_a=(Functions.array_sum(Functions.factors(a)))-a;
        int sum_b=(Functions.array_sum(Functions.factors(b)))-b;
        if(sum_a==b && sum_b==a)
        return true;
        return false;
    }
    public static boolean lychrel_check(BigInteger n)
    {
        BigInteger num = new BigInteger("0");
        num=n;
        for(int i=1;i<=500;i++)
        {
            BigInteger x=Functions.reverse(num);
            BigInteger sum=num.add(x);
            if(Number_Names.palindrome_check(sum))
                return false;
            num=sum;
        }
        return true;
    }
    public static boolean superugly_check(int list[], int num)
    {
        int x[]=Functions.prime_factors(num);
        for(int i=0;i<x.length;i++)
        {
            if(Functions.array_search(list, x[i]))
                continue;
            else
                return false;
        }
        return true;
    }
}