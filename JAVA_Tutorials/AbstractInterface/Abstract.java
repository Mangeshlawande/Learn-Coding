
abstract class Demo
{
    int x, y;
Demo(){
    System.out.println("Parent's constructor");

}
    void f1()
    {
        x = 4;
        y = 6;
    }
    abstract void f2();// abs fun cannot have a body

    
}

class Demo1 extends Demo
{
    int z;
    Demo1(){
        System.out.println("Child's constructor");
    
    }
    void f2()
    {

    }

    void f3()
    {
        z = 8;
        System.out.println("z= "+z);

    }
}

public class Abstract {
    public static void main(String []args){
        // System.out.println("Abstract class and abstract function ");

        Demo1 d1 = new Demo1();
        d1.f3();
    }
    
}
// kya hum same main fun bana sakte hain kya
// public static main fun ki overloading ki ja sakti hai kya ? in same class