//RunTime error handling Method
class Program8
{
       
        public void div(int a,int b) throws ArithmeticException
        {       
                int c=a/b;
                System.out.println("Answer is:"+c);
        }
        public static void main(String args[])
        {
                
                try{    
                        Program8 p= new Program8();
                        p.div(10,5);
                        p.div(10,0);
                    }
                catch(ArithmeticException e)
                {
                        System.out.println(e.getMessage());    
                }
                finally
                {
                        System.out.println("End!");
                }
        }
}
