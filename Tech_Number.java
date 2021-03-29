public class Tech_Number 
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
}  