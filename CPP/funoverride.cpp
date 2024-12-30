#include<iostream>
using namespace std;

class A
{
    public:
 virtual void f1()// for late binding of parent function
 {
    cout <<"Parent f1 is executed !!"<<endl;
 };
 void f2(int x)// function Hiding 
 {
    cout <<"Parent f2 is executed !!"<<endl;
 };
};

class B: public A
{
    public:

    void f1()  // function overriding 

    {
        cout <<"Child f1 is executed !!"<<endl;
    };

};

/*
by using pointer we can called parent function in overriding 
compiler decide in compile time which function is going to run 
the address is obtained in runtime,hence pointer can called/bind same type of  function which was wrong
>> object and thier fun is need to get called but violate the concept;

early binding :
to avoid early binding  virtual function is used
>> parent ke fun ke late binding ho sake isliya virtual function usekia jata hai
*/

int main()
{
    A * a1;
    B b1;
    a1 = &b1;
    a1->f1();// call parent class function instead of child function 
    cout<<"Function OverRiding "<<endl;
    // cout<<"Function hiding "<<endl;
    
    return 0;
}