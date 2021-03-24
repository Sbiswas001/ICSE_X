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
    public int array_sum(int a[])
    {
        int n=a.length, sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
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
    public int[] digit_array(int a)
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
    public int no_of_factors(int n)
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
    public int[] factors(int n)
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
    public int no_of_pfactors(int n)
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
    public int[] prime_factors(int n)
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
    public boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    public int[] asort_int(int a[])
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
    public int[] dsort_int(int a[])
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
    
    
    
    
    public long factorial(long a)
    {
        long p=1;
        for(long i=1;i<=a;i++)
        p*=i;
        return p;
    }
    public long reverse(long n)
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
    public long array_sum(long a[])
    {
        long n=a.length, sum=0;
        for(long i=0;i<n;i++)
        {
            sum+=a[(int)i];
        }
        return sum;
    }
    public long digit_sum(long n)
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
    public long number_of_digits(long n)
    {
        long length = 0;  
        while(n != 0)
        {  
            length++;  
            n = n/10;  
        }  
        return length;
    }
    public long[] digit_array(long a)
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
    public long no_of_factors(long n)
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
    public long[] factors(long n)
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
    public long no_of_pfactors(long n)
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
    public long[] prime_factors(long n)
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
    public boolean isPerfectSquare(long x)
    {
        long s = (long) Math.sqrt(x);
        return (s*s == x);
    }
    public long[] asort_long(long a[])
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
    public long[] dsort_long(long a[])
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
}
