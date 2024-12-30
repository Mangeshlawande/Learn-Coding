// kisi bhi java file ke under kisi bhi class ke static member ko call karne ke lia class ka name dot lagana padta hai ; IMP note 
class Area // kisi bhi class ke member ko call karne ke lia us calss ka name and function name dena padta hai , eg : Area.fun1();
{
static void fun1()
{
    System.out.println("Area A1");
}
  static void fun2() // static aarea le under static function function function ko hi call kia ja sakta hai;

    {
        System.out.println("Area B1");
    }
}

class Example
{
     static void fun1()
    {
        System.out.println("A");
    }
     static void fun2() // static aarea le under static function function function ko hi call kia ja sakta hai;

    {
        System.out.println("B");
    }
    public static void main(String[]args)
    {
        System.out.println("C");
         fun1(); // we can't call non-static function ;
	 Example.fun2(); // can also called as this type
       Area.fun1();
       Area.fun2();
    }
}