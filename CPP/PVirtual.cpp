#include<iostream>
using namespace std;
// Pure Virtual Function
class A
{
    public:
    A(){
        cout << "Parent Constructor is Executed"<<endl;
    };
virtual void f1() = 0;


};
class B : public A
{
    public :
    B(){
        cout << "child Constructor is Executed"<<endl;
    };


void f1()//overriding
{

}
};


int main ()
{
B a1;

    return 0;
};
