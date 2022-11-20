import java.util.Scanner;
class Program5
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[5][5];
        int t[][]=new int[5][5];
        
        ;
        //Matrix A
        System.out.println("Enter the rows of Ist matrix:");
        int r=s.nextInt();
        System.out.println("Enter the columns of Ist matrix:");
        int c=s.nextInt();
        System.out.println("Enter the Ist matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("The Original matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
        
        //Matrix Transpose
        
        
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                t[i][j]=a[j][i];
            
            }
        }
         
        //Display Matrix C
        System.out.println("The Transpose of matrix A is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}