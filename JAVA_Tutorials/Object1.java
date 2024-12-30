// Jo member static nahi hai unko kaise use kare ? 
// for non-static member function (instance member variable/ object member varable ) 
// 
class  Kakashi
{
    // class ke under memory bhi banai ja sakti hai ;
    int x ;// instance (object ke under wale varaibles) member variable
    // mamory banane ki process ko non-static variable, variable means memory;

    int y;
    void fun1() // instnce member function 
    {
        System.out.println("The full name is kakashi hatake. \n");
    }
    void fun2() // instnce member function ;
    {
        System.out.println("His nick name is  the copy ninja");
    }
}
class Object1
{
    public static void main(String []args)
    {
    System.out.println("welcome to programming in java");
    Kakashi e1 = new Kakashi();

    e1.x =5;
    // e1.y=76; 
    // bydefault the value of any var is 0 in java;
    e1.fun1();
    e1.fun2();
    System.out.println(e1.x);
    System.out.println(e1.y);

    Kakashi e2 = new Kakashi();
    e2.x = 89;
    e2.y=24;
     System.out.println(e2.x);
     System.out.println(e2.y);

    }
}

//building kaisi honi chahiye, ye batana matlab class banana (structure in cpp = class in java);
// direct building ko banana matlab object banana;
// object kaise banega

//  for nonstatic member function();

// java syntax for creating object  eg: (className)Example e1(reference variable e1)= new Example()
//e1 name ki memory banegi type example ,
//  new ki madad se  object banta hai , example class ka ;
// example --> fun1() , fun2() 
// for calling thihs object  ==> e1.fun1(), etc.,
// Example e2 = new Example(); // e2 points fun2(), fun3() 

// Example v1 = new Example();
        // v1 = new example();
// 1 reference variable and 2 new object
// after completing task it move next fun();
// after some times it gets deleted by garbage collector ;
//  it deleted the unreferenced( jise koi refer nahi kr raha hai)  block 

