import java.util.*;
import java.math.BigInteger;

public class Functions
{
    public static int factorial(int a)
    {
        int p=1;
        for(int i=1;i<=a;i++)
        p*=i;
        return p;
    }
    public static int reverse(int n)
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
    public static int array_sum(int a[])
    {
        int n=a.length, sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
    public static int digit_sum(int n)
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
    public static int digit_product(int n)
    {
        int product=1, r=0;
        while(n>0)
        {    
            r=n%10; 
            product*=r;    
            n=n/10;    
        }
        return product;
    }
    public static int number_of_digits(int n)
    {
        return (int)Math.floor(Math.log10(n))+1;
    }
    public static boolean array_search(int a[], int x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(x==a[i])
            return true;
        }
        return false;
    }
    public static int[] digit_array(int a)
    {
        int x[] = new int[number_of_digits(a)];
        int num=reverse(a);
        for(int i=0;i<number_of_digits(a);i++)
        {
            x[i]=num%10;
            num/=10;
        }
        return x;
    }
    public static int no_of_factors(int n)
    {
        int count=1;
        if(n>=2)
        {
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] factors(int n)
    {
        int l=1;
        int num[] = new int[no_of_factors(n)];
        num[0]=1;
        if(n>=2)
        {
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    num[l]=i;
                    l++;
                }
            }
        }
        return num;
    }
    public static int no_of_pfactors(int n)
    {
        int count=0;
        Prime_Number ob1 = new Prime_Number();
        if(n>=2)
        {
            for(int i=2;i<=n;i++)
            {
                if(ob1.prime_check(i))
                {
                    while(n%i==0)
                    {
                        n=n/i;
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int[] prime_factors(int n)
    {
        int l=0;
        Prime_Number ob1 = new Prime_Number();
        int num[] = new int[no_of_pfactors(n)];
        if(n>=2)
        {
            for(int i=2;i<=n;i++)
            {
                if(ob1.prime_check(i))
                {
                    while(n%i==0)
                    {
                        n=n/i;
                        num[l]=i;
                        l++;
                    }
                }
            }
        }
        return num;
    }
    public static boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    public static int[] asort_int(int a[])
    {
        int temp=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;  
    }
    public static int[] dsort_int(int a[])
    {
        int temp=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;  
    }
    
    
    
    
    public static long factorial(long a)
    {
        long p=1;
        for(long i=1;i<=a;i++)
        p*=i;
        return p;
    }
    public static long reverse(long n)
    {
        long sum=0, r=0; 
        while(n>0)
        {    
            r=n%10; 
            sum=(sum*10)+r;    
            n=n/10;    
        }
        return sum;
    }
    public static boolean array_search(long a[], long x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(x==a[i])
            return true;
        }
        return false;
    }
    public static long array_sum(long a[])
    {
        long n=a.length, sum=0;
        for(long i=0;i<n;i++)
        {
            sum+=a[(int)i];
        }
        return sum;
    }
    public static long digit_sum(long n)
    {
        long sum=0, r=0;
        while(n>0)
        {    
            r=n%10; 
            sum+=r;    
            n=n/10;    
        }
        return sum;
    }
    public static long digit_product(long n)
    {
        long product=1, r=0;
        while(n>0)
        {    
            r=n%10; 
            product*=r;    
            n=n/10;    
        }
        return product;
    }
    public static long number_of_digits(long n)
    {
        return (long)Math.floor(Math.log10(n))+1;
    }
    public static long[] digit_array(long a)
    {
        long x[] = new long[(int)number_of_digits(a)];
        long num=reverse(a);
        for(long i=0;i<number_of_digits(a);i++)
        {
            x[(int)i]=num%10;
            num/=10;
        }
        return x;
    }
    public static long no_of_factors(long n)
    {
        long count=1;
        if(n>=2)
        {
            for(long i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static long[] factors(long n)
    {
        long l=1;
        long num[] = new long[(int)no_of_factors(n)];
        num[0]=1;
        if(n>=2)
        {
            for(long i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    num[(int)l]=i;
                    l++;
                }
            }
        }
        return num;
    }
    public static long no_of_pfactors(long n)
    {
        long count=0;
        Prime_Number ob1 = new Prime_Number();
        if(n>=2)
        {
            for(long i=2;i<=n;i++)
            {
                if(ob1.prime_check((int)i))
                {
                    while(n%i==0)
                    {
                        n=n/i;
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static long[] prime_factors(long n)
    {
        long l=0;
        Prime_Number ob1 = new Prime_Number();
        long num[] = new long[(int)no_of_pfactors(n)];
        if(n>=2)
        {
            for(long i=2;i<=n;i++)
            {
                if(ob1.prime_check((int)i))
                {
                    while(n%i==0)
                    {
                        n=n/i;
                        num[(int)l]=i;
                        l++;
                    }
                }
            }
        }
        return num;
    }
    public static boolean isPerfectSquare(long x)
    {
        long s = (long) Math.sqrt(x);
        return (s*s == x);
    }
    public static long[] asort_long(long a[])
    {
        long temp=0;
        long n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;  
    }
    public static long[] dsort_long(long a[])
    {
        long temp=0;
        long n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;  
    }
    
    
    public static BigInteger reverse(BigInteger n)
    {
        BigInteger sum = new BigInteger("0");
        BigInteger r = new BigInteger("0");
        while(n.compareTo(BigInteger.ZERO)>0)
        {    
            r=n.mod(BigInteger.TEN); 
            sum=(sum.multiply(BigInteger.TEN)).add(r);    
            n=n.divide(BigInteger.TEN);    
        }
        return sum;
    }
}
