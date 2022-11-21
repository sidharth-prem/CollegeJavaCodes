//Program to Check for string palindrome
import java.util.Scanner;
class Program12
{
        public static void main(String args[])
        {
                Scanner s=new Scanner(System.in);
                System.out.println("Enter a string:");
                String str=s.nextLine();
                String rev="";
                for(int i=str.length()-1;i>=0;i--)
                {
                        rev=rev+str.charAt(i);
                }
                System.out.println("Reversed String is:"+rev);
                if(str.equalsIgnoreCase(rev))
                {
                        System.out.println("The string is Palindrome!");
                }
                else
                {
                        System.out.println("The string is not Palindome!");
                }        
        }
}       
