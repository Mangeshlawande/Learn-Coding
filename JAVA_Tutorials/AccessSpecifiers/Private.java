
class Demo{
    int x, y;
    Demo(int p, int q)
    {
        x = p;
        y = q;
    }
    Demo()
    {
        System.out.println("Constructor 1 is Executed ");

    }
    Demo(int p)
    {
        x = p;
        System.out.println("Constructor 1 is Executed ");

    }
    void setDisplay()
    {
        System.out.println("x = "+x);
        System.out.println("Y = "+y);
    }
    void fun1()
    {
        x = 22;
        y = 54;
        System.out.println("Functon 1 is Executed ");

    }
}

public class Private {
    public static void main (String []args)
    {
        Demo d1 = new Demo(8,4);
        // Demo d2 = new Demo();
        Demo d3 = new Demo(56);
        d1.setDisplay();
        d1.fun1();
        System.out.println(d1.x);
        System.out.println(d1.y);
        System.out.println(d3.x);

    }
    
}
