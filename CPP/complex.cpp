#include<iostream>
using namespace  std;


class Complex 
{
int x,y;
public:
void setData(int p, int q)
{
    x = p;
    y = q;
};
Complex operator +(Complex g1)  // if DT is complex then return type is complex;
{
    Complex h1;
 h1.x = x + g1.x;
 h1.y = y + g1.y;
 return h1;
};

void display()
{
    cout<<x <<" + "<<y<<"i"<<endl;
};
};

//write a cpp program to overload binary operator


int main()
{
Complex c1, c2, c3;
c1.setData(11, 17);
c2.setData(12, 19);
// c3 = c1.add(c2);
c3 = c1+c2;// operator overloading 
c3.display();

// int c3x = c1.x + c2.x;
// int c3y = c1.y + c2.y;
// cout << "The addition is :"<<c3x <<"+"<<c3y<<"i"<<endl;


return 0 ;
};
// class Complex 
// {
// int x,y;
// public:
// void setData(int p, int q)
// {
//     x = p;
//     y = q;
// };
// Complex add(Complex g1)  // if DT is complex then return type is complex;
// {
//     Complex h1;
//  h1.x = x + g1.x;
//  h1.y = y + g1.y;
//  return h1;
// };

// void display()
// {
//     cout<<x <<" + "<<y<<"i"<<endl;
// };
// };


// int main()
// {
// Complex c1, c2,c3;
// c1.setData(11,17);
// c2.setData(12,19);
// c3 = c1.add(c2);
// c3.display();

// // int c3x = c1.x + c2.x;
// // int c3y = c1.y + c2.y;
// // cout << "The addition is :"<<c3x <<"+"<<c3y<<"i"<<endl;


// return 0 ;
// };