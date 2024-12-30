// HOW TO access private variable in main() function ?
class Demo
{
    public static void main(String[]args)
    {
        program p1 = new program();
        p1.f1();
        System.out.println("Area A1");
    }
}

//  IMP sttatic member Ek hi bar banta hai
class program
{// static member ko bina object banaye access kr sakte hai;
int y;
    private static int x;
    void f1()
    {
        x = 5;
         System.out.println(x);
    }// can make any numbers of function;
}
// Q. How we can access private static member variable without creating an object ?
// ANS => we can make function static now no need to make object 
// we can access private static variable with the help of static function we can call static function with class name ;

// Interview Fix questions(compulsary )
//  writing these answer in 4-5 pages ;

// tell me about yourself ?
// Why you want to join our company ?
// Tell me yours qualities ?
// what is your weak points and strong points?
// 