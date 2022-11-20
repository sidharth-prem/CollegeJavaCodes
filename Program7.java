import java.util.Scanner;
class Overload
{
    public double area(double r)
    {
        double A1=3.14*r*r;
        return A1;
    }
    public int area(int l,int b)
    {
        int A2=l*b;
        return A2;
    }
    public double area(double h,double bs)
    {
        double A3=0.5*bs*h;
        return A3;
    }
}
class Program7
    {
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        Overload O =new Overload();
        System.out.println("Enter the radius");
        double r=S.nextDouble();
        System.out.println("Area of circle is:"+O.area(r));
        System.out.println("Enter the length and breadth");
        int l=S.nextInt();
        int b=S.nextInt();
        System.out.println("Area of rectangle is:"+O.area(l,b));
        System.out.println("Enter the height and base");
        double h=S.nextDouble();
        double bs=S.nextDouble();
        System.out.println("Area of triangle is:"+O.area(h,bs));
    }
}

