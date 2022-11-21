//Checking the FREQUENCY of a given element in string!
import java.util.Scanner;
class Program13
{
        public static void main(String args[])
        {
                Scanner s=new Scanner(System.in);
                System.out.println("Enter a string:");
                String str=s.nextLine();
                System.out.println("Enter the character to be checked:");
                char ch=s.next().charAt(0);//To  read character
                int count=0;
                for(int i=0; i<str.length();i++)
                {
                        if(ch==str.charAt(i))
                        {
                                count++;
                        }
                }
                System.out.println("The frequency of"+ch+" is:"+count);
        }
}
