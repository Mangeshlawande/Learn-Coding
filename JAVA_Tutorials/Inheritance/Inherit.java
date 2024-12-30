
class Nokia1
{
    int x,y;
    Nokia1(){
    System.out.println("Parent Constructor  executed !!");

    }
    void f1()
    {
    System.out.println("Parent Constructor  executed !!");

    }
    void f2()
    {
    System.out.println("Parent function 2 executed!!");

    }
    
}
//Single Inheritance ;  one parent class --> one child class
class Nokia2 extends Nokia1
{
    int z;

    void f3()
    {
        System.out.println("Child function 1 executed !!");
    }
    Nokia2(){
        //  super();
        System.out.println("Child Constructor executed !!");

    }
}
// Hierarchical ; one parent class --> Many child class
// miltilevel  ; parent class extends their child class , child class extends their own child class
// multiple Inheritance (Interface in java) : two parents --> one child 
class Nokia3 extends Nokia1
{

}
class Inherit
{
    public static void main(String[]args)
    {
    //    Nokia2 n1 = new Nokia2();
    //    n1.f1();
    //    n1.f2();
    //    n1.f3();
    }
}