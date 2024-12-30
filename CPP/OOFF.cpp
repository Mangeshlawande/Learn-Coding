// operator overloading using friend function 

#include <iostream>
using namespace std;

class Demo
{
int x,y;
public:
void setData(int p, int q)
{
    x = p; 
    y = q;

};
void display()
{
    cout << x <<" " << y<<endl;
};
friend Demo operator +(Demo a1, Demo a2);

};


Demo operator +(Demo a1, Demo a2)
{
    Demo b;
   b.x = a1.x + a2.x;
   b.y = a1.y + a2.y;
    return b;

};

int main()
{
    Demo d1, d2,d3;
    d1.setData(2,4);
    d2.setData(8,4);
    // d3 = +(d1,d2);// define as in + fun we pass arg d1,d2 and return value is catch in d3 ;
    
    d3 = d1 + d2 ;// operator overloading 
    d3.display();

    return 0;
};