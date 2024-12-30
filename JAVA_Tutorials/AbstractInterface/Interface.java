// interface ke under ke variable by default public , static final hote hai
// interface ke under ke fun ko aap kabhi defined nahi kr sakte.,by default fun public and abstract hote hai 
// there is no ned to write abs keyword bcoz fun already abstract eg., void f1();
//  fun have no body 
//  if interface ke under 1 bhi fun static hai , to uski body bn sakkti hai

//  if you make another interface with the help of interface then extends key word is compulsary
// to write ;

//abs class ke child mai overriding karni padti hai
// interface extends interface 
// class extends class
// class implement interface
interface I0
{

    int x = 56;// final value cant be assign value later
    // there is no need to  assign values in interface bcoz var are public static and final so we have 
    //initialize value during declaration 
    // constructor  is not required 
    // iska obj nahi  banta


    // fun bydefault abs and public hote hai ,have no body
    void f1();
    // if you want to define a fun then it makes static fun 
    static void fun2()
    {
        System.out.println("The func must be static in interface then you can make function body ");
        System.out.println("x = "+x);
    }
};

interface I1 extends I0
{
    int y = 92;

 void f2();

}
// class C implements I0,I1 // multiple inheritance using interface he he
class C implements I1 // multiple inheritance using interface he he
{
public void f1() // fun overriding is important varna obj nahi ban payega
{
// interface main var ke bich main overriding  hoti hai, or it can inherited from above class
}
public void f2()
{

}
};

public class Interface 
 {
    public static void main(String []args)
    {
        System.out.println("Interface ");
        // I0.fun2();

        // C a1 = new C();a1.x
        // System.out.println(a1.x);// variable is accessible in interface
        // I1.f2();//not inherited 

        
    }


}
