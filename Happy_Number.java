public class Happy_Number
{ 
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
}  