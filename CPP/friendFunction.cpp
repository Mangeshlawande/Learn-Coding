#include<iostream>
#include<string.h>
using namespace std;

class Demo

{
    friend int fun1(Demo, int, int);         // generally write only datatype
    int x,y;
    public:
    void fun(int p, int q)
    {
        x = p;
        y = q;
    };
// friend int fun1(Demp d1, int j, int k);   // generally write only datatype
};

 int fun1(Demo d1, int j, int k)
{
    d1.x = j;
    d1.y = k;
    int l = d1.x + d1.y;
    return l;


    // cout<< "Function 1 is executed !!"<<endl;
    /*Demo d1;
    d1.x = 12;
    d1.y = 90;
    cout <<d1.x<< " "<<d1.y<<endl;S
    */
};

int main ()
{
    Demo d1;
    int h;
    h = fun1(d1,4,6);
    cout <<h<<endl;

    
    return 0;
};
