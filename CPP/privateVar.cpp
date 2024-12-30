#include <iostream>
// #include <conio.h>
using namespace std;

// how to access private variable in a class and static members in c++
//in C++, we can define function in structures but we cant access in c;

class Example
{ // by default private :
    int x; // instance(object) member var;
    int y;
    public :

    void setData(int p, int q){
        x = p;
        y = q;
        int r;
        r = 90;//local variable
    };


    void display(){
        cout <<x<<" "<<y<<endl;
    };

};


class Demo
{
    int x, y,z;
    public :
    static int s;

    void setData(int p, int q){
        x = p;
        y = q;
        int r;
        r = 90;//local variable

    };


    void display(){
        cout <<x<<" "<< y <<endl;
    };

};
int Demo :: s;

int p = 55; // global var can access anywhere in the program 

int main()
{

    // there is only one copy of static member
    // A static member is shared by all object of the class.

    Example e1; // object=instance
    e1.setData(2,3);
    e1.display();

    Example e2;
    e2.setData(26,32);
    e2.display();
     
     Demo :: s =32; // without creating object 
    Demo d1;
    // Demo d1 s = 90; // static  variable created at once;


    // getch();
    return 0;
};

