public class Ascending
{
    public int[] sort_int(int a[])
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
}