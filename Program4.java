import java.util.Scanner;
class Program4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[5][5];
        int b[][]=new int[5][5];
        int c[][]=new int[5][5];
        int k;
        //Matrix A
        System.out.println("Enter the rows of Ist matrix:");
        int r1=s.nextInt();
        System.out.println("Enter the columns of Ist matrix:");
        int c1=s.nextInt();
        System.out.println("Enter the Ist matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("The 1st matrix is:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
        //Matrix B
        System.out.println("Enter the rows of IInd  matrix:");
        int r2=s.nextInt();
        System.out.println("Enter the columns of IInd matrix:");
        int c2=s.nextInt();
        System.out.println("Enter the IInd matrix:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("The 2nd matrix is:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("\n");
        }
        //Matrix multiplication
        if(c1==r2)
        {
           for(int i=0;i<r1;i++)
           {
            for(int j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(k=0;k<r1;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
           }
        }
        else
        {
            System.out.println("Multiplication not Possible");
        }
        //Display Matrix C
        System.out.println("The matrix C is:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}