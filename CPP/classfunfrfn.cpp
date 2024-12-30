// class ke under ka function dusare class ka friend function ho sakta hai
#include<iostream>
using namespace std;
class A
{

public:
void f1()
{
cout <<" function 1 is executed from class A inside class A "<<endl;
};

void f2()
    {
    cout <<" function 1 is executed from class A inside class B "<<endl;

    };
};

class B
{
    friend A;  // passing class as friend;


    public :
    // friend void A:: f1();
    // friend void A:: f2();
    A a1;
   
 void display()
 {
      a1.f1();
      a1.f2();
    cout<< " Both functions are executed in class B from A "<<endl;
 }
    
};

int main(){
    
    B b1;
    b1.display();
    

    return 0;

};
