import java.util.Scanner;
class Program21
{
 public void QS(int A[],int p,int r)
 {
  if(p<r)
  {
   int q=partition(A,p,r);
   QS(A,p,q-1);
   QS(A,q+1,r);
  }
 }
 public int partition(int A[],int p,int r) 
 {
  int pivot=A[r];
  int i=p-1;
  for(int j=p;j<=r-1;j++)
  {
   if(A[j]<=pivot)
   {
    i++;
    int t=A[i];
    A[i]=A[j];
    A[j]=t;
   }
  }
  int temp=A[i+1];
  A[i+1]=A[r];
  A[r]=temp;
  return i+1;
 }   
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  Program21 P=new Program21();
  int p=1;
  int A[]=new int[10];
  System.out.println("Enter the number of elements");
  int n=s.nextInt();
  int r=n;
  System.out.println("Enter the Terms");
  for(int i=1;i<=n;i++)
  {
   A[i]=s.nextInt();
  }
  P.QS(A,p,r);
   System.out.println("Sorted elements are");
   for(int i=1;i<=n;i++)
   {
    System.out.println(A[i]+"\t");
   }
  }
}   
