public class Automorphic_Number
{
    public boolean automorphic_check(int num)
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
}