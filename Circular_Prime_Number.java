public class Circular_Prime_Number
{
    public boolean circular_prime_check(int a)
    {
        Prime_Number ob1 = new Prime_Number();
        Functions ob2 =  new Functions();
        int count=ob2.number_of_digits(a);
        int num=a, k=a;
        for(int i=1;i<=count;i++)
        {
            int x=k%10;
            if(x==0 || x==2 || x==4 || x==6 || x==8 || x==5)
            return false;
            k/=10;
        }
        while(ob1.prime_check(a))
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