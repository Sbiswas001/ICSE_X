import java.util.*;
import java.math.*;

public class Number_Properties
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(Tech_Number.tech_check(num))
            System.out.println(num+" is a Tech Number!");
        if(Prime_Number.prime_check(num))
            System.out.println(num+" is a Prime Number!");
        if(Palindrome_Number.palindrome_check(num))
            System.out.println(num+" is a Palindrome Number!");
        if(Disarium_Number.disarium_check(num))
            System.out.println(num+" is a Disarium Number!");
        if(Niven_Number.niven_check(num))
            System.out.println(num+" is a Niven Number!");
        if(Emirp_Number.emirp_check(num))
            System.out.println(num+" is a Emirp Number!");
        if(Pronic_Number.pronic_check(num))
            System.out.println(num+" is a Pronic Number!");
        if(Special_Number.special_check(num))
            System.out.println(num+" is a Special Number!");
        if(Lucas_Number.lucas_check(num))
            System.out.println(num+" is a Lucas Number!");
        if(Smith_Number.smith_check(num))
            System.out.println(num+" is a Smith Number!");
        if(Armstrong_Number.armstrong_check(num))
            System.out.println(num+" is a Armstrong Number!");
        if(Fibonacci_Number.fibonacci_check(num))
            System.out.println(num+" is a Fibonacci Number!");
        if(Kaprekar_Number.kaprekar_check(num))
            System.out.println(num+" is a Kaprekar Number!");
        if(Happy_Number.happy_check(num))
            System.out.println(num+" is a Happy Number!");
        if(Spy_Number.spy_check(num))
            System.out.println(num+" is a Spy Number!");
        if(Neon_Number.neon_check(num))
            System.out.println(num+" is a Neon Number!");
        if(Ugly_Number.ugly_check(num))
            System.out.println(num+" is a Ugly Number!");
        if(Fermat_Number.fermat_check(num))
            System.out.println(num+" is a Fermat Number!");
        if(Abundant_Number.abundant_check(num))
            System.out.println(num+" is a Abundant Number!");
        if(ISBN.isbn_check(num))
            System.out.println(num+" is a ISBN Number!");
        if(Circular_Prime_Number.circular_prime_check(num))
            System.out.println(num+" is a Tech Number!");
        if(Prime_Palindrome_Number.prime_palindrome_check(num))
            System.out.println(num+" is a Prime Palindrome Number!");
    }
}