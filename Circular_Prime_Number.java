public class Circular_Prime_Number
{
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
        while(Prime_Number.prime_check(a))
        {
            int rem = num % 10;
            int div = num / 10;
            num = (int)((Math.pow(10, count - 1)) * rem) + div; 
            if (num == a)
            return true;
        }
        return false;
    }
}