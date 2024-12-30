/*
overloading :
2 fun() having same name and different parameter called overloading
1. constructor overloading ;
 2.function overloading ;
>> compiler have to decide compile-time which function need to called is called 

>> when we called at that time compiler has to decide which function has to be 
executed during compiletime called polymorphism.

constructor:
when object is created constructor is created automatically by compiler  even it is not created by user 
it is public by default
// it called automatically when object is getting created .
// special function  called constructor
// default(without parameter) and parameterized constructor(parameter)
!. to restrict the from creting object then create private constructor


*/


#include <iostream>
using namespace std;

// constructor / spcial function
//  constructor overloading 

class Exam
{
    int x;
    static int y;

    public :
    void fun1()
    {
        cout <<"A"<<endl;
        cout<<"B"<<endl;
    };
//  default(without parameter) and parameterized constructor(parameter)
    Exam(int r)// parameterized constructor
    {
        int c = r;
        cout<<"C = "<<c<<endl;
    };

    Exam()// Default constructor
    {
        int c = 30;
        cout<<"called Default constructor "<<endl;
    };

};


int main()
{
 Exam e1(78);// passing parameter 
 Exam e2;// default 


    return 0;
};