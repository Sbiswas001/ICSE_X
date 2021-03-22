public class Search
{
    public int find_int(int a[], int x)
    {
        int temp=0, i;
        int n=a.length;
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                temp++;
                break;
            }
        }
        if(temp==0) return -1;
        return i;  
    }
}