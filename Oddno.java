class Oddno1 extends Thread
{
        public void run()
        {
                for(int i=1;i<=100;i++)
                {
                        if (i%2!=0)
                                System.out.println("odd no="+i);
                }
        }        
}


class Evenno1 extends Thread
{
        public void run()
        {
                for(int i=1;i<=100;i++)
                {
                        if (i%2==0)
                                System.out.println("even no="+i);
                }
        }
}


class Oddno
{
        public static void main(String args[])
        {
                try
                {                       
                        Oddno1 p1=new Oddno1();
                        Evenno1 p2= new Evenno1();
                        p1.start();
                        p2.start();
                        p1.join();
                        p2.join();
                }
                catch(InterruptedException e)
                {
                        System.out.println(e.getMessage());
                }
        }
}

