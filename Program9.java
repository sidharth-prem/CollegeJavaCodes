class Table
{
        public synchronized void printing(int n)//Method
        {
                for(int i=1;i<=10;i++)
                        System.out.println(n+"x"+i+"="+(n*i));
        }
}

class MyTable1 extends Thread//Thread class
{
        private Table t;//t is an object
        public MyTable1(Table t)
        {
                this.t=t;
        }
        public void run()
        {
                t.printing(5);
        }

}

class MyTable2 extends Thread//Thread class
{
        private Table t;
        public MyTable2(Table t)
        {
                this.t=t;
        }
        public void run()
        {
                t.printing(10);
        }

}

class Program9
{
        public static void  main(String args[])
        {
                try{
                        Table p=new Table();//Actual object p is created
                        MyTable1 mt1=new MyTable1(p);
                        MyTable2 mt2=new MyTable2(p);
                        mt1.start();
                        mt2.start();
                        mt1.join();
                        mt2.join();
                   }
                catch(InterruptedException e)
                {
                        System.out.println(e.getMessage());
                }
        }
}        
