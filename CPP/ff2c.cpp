
//friend function used in 2 classes

#include<iostream>
using namespace std;


class Example2;// class declaration 

class Example1
{
    int x;
    public:
     void fun1()
     {
        cout << "Function 1 called"<<endl;
     }
    friend int fun3(Example1 ,Example2 );
};

class Example2
{
    int y;
    public:

     void fun2()
     {
        cout << "Function 1 called"<<endl;
     }
     friend int fun3(Example1 ,Example2 );
};

int fun3(Example1 e1,Example2 e2)
{
    int k;
    e1.x = 23;
    e2.y = 44;
    k = e1.x + e2.y;
    return k;

}


int main()
{
    Example1 e1;
    Example2 e2;
    int h;
    h = fun3(e1,e2);
    std ::cout << h<<endl;

    return 0;
}