


class A
{
   private int x;
    // private static int y;
    static int y;
    void fun1()
    {
        x = 5;
        y = 22;
    }
    void fun2()
    {
        System.out.println(x);
    }
    void fun3()
    {
        y = 45;
    }

}
class StaticMembers
{
    public static void main(String[]args)
    {
        A a1= new A();
        A a2 =new A();
          a1.fun1();
          a2.fun2();
          a1.fun2();
    }
}
//  private instance member (object compulsary) variable main data kaise rakhenge
// 