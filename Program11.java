//Program to reverse a given string
import java.util.Scanner;
class Program11
{
        public static void main(String args[])
        {
                Scanner s=new Scanner(System.in);
                System.out.println("Enter a string:");
                String st=s.nextLine();
                String rev="";
                for(int i=st.length()-1;i>=0;i--)
                {
                        rev=rev+st.charAt(i);
                }
                System.out.println("Reversed String is:"+rev);
        }
}       
