import java.util.Scanner;
class Program6
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int a[]=new int[10];
        int i;
        int j;
        System.out.println("Enter the size:");
        int n=s.nextInt();
        System.out.println("Enter the elements to the array:");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]< a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;;
                }
            }
        }
        System.out.println("The second smallest element is: "+ a[n-2]);
    }
}
