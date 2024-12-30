// This is a object pointer , jo object banega vo apne object ko point karta hai 
// this refers to the current object 
//  instance member variable access karne ke lia hi this ka use kia jata hai 
//  2 var har fun kea undear hote hain ie super and this 
// super function => compiler super likh ke uper jaTa hain , parent ke constructor ko chalata hain 
// the super points parent functions/class;
// this point whole object 


class Example 
{
     int x,y;
    void f1(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);

    }
}

class Example1 extends Example
{
    int x , y;
    void f3(int x, int y)
    {
        // parent ke member ko access karne ke lia parent child main aa raha hain  called overriding (fun name and argument both are same called ovrriding )

        //  jiska object banega vahi chalega chalega 
       super.x = 5;// goes to parent x and y by using super keyward;
       super.y = 6;
    }
     void f4()
    {
        System.out.println(super.x);
        System.out.println(this.y);

    }
}


class ThisK
{
 public static void main (String[]args)
 {
    Example1 e1 = new Example1();
    e1.f3(7,9);// local variable 
    e1.f4();

    
    /*
   Example e1 = new Example();
   e1.f1(54, 67);
   e1.display();
   */



 }
}