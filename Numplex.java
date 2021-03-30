import java.util.*;
import java.math.*;
public class Numplex
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(Number_Names.tech_check(num))
            System.out.println(num+" is a Tech Number!");
        if(Number_Names.prime_check(num))
            System.out.println(num+" is a Prime Number!");
        if(Number_Names.palindrome_check(num))
            System.out.println(num+" is a Palindrome Number!");
        if(Number_Names.disarium_check(num))
            System.out.println(num+" is a Disarium Number!");
        if(Number_Names.niven_check(num))
            System.out.println(num+" is a Niven Number!");
        if(Number_Names.emirp_check(num))
            System.out.println(num+" is a Emirp Number!");
        if(Number_Names.pronic_check(num))
            System.out.println(num+" is a Pronic Number!");
        if(Number_Names.special_check(num))
            System.out.println(num+" is a Special Number!");
        if(Number_Names.lucas_check(num))
            System.out.println(num+" is a Lucas Number!");
        if(Number_Names.smith_check(num))
            System.out.println(num+" is a Smith Number!");
        if(Number_Names.armstrong_check(num))
            System.out.println(num+" is a Armstrong Number!");
        if(Number_Names.fibonacci_check(num))
            System.out.println(num+" is a Fibonacci Number!");
        if(Number_Names.kaprekar_check(num))
            System.out.println(num+" is a Kaprekar Number!");
        if(Number_Names.happy_check(num))
            System.out.println(num+" is a Happy Number!");
        if(Number_Names.spy_check(num))
            System.out.println(num+" is a Spy Number!");
        if(Number_Names.neon_check(num))
            System.out.println(num+" is a Neon Number!");
        if(Number_Names.ugly_check(num))
            System.out.println(num+" is a Ugly Number!");
        if(Number_Names.fermat_check(num))
            System.out.println(num+" is a Fermat Number!");
        if(Number_Names.abundant_check(num))
            System.out.println(num+" is a Abundant Number!");
        if(Number_Names.isbn_check(num))
            System.out.println(num+" is a ISBN Number!");
        if(Number_Names.circular_prime_check(num))
            System.out.println(num+" is a Tech Number!");
        if(Number_Names.prime_palindrome_check(num))
            System.out.println(num+" is a Prime Palindrome Number!");
    }
}