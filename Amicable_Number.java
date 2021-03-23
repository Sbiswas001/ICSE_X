public class Amicable_Number
{
    public boolean amicable_check(int a, int b)
    {
        Functions ob1 = new Functions();
        int sum_a=(ob1.array_sum(ob1.factors(a)))-a;
        int sum_b=(ob1.array_sum(ob1.factors(b)))-b;
        if(sum_a==b && sum_b==a)
        return true;
        return false;
    }
}