#include<iostream>
// #include<conio.h>
using namespace std;
 // person - student - teacher
class Bank
{
    int g;//private
    public:
    virtual void rofi()=0;
    //rate of interest

     Bank(){
        g = 28;
        cout<<"Parent's constructor "<<"g = "<<g<<endl;
    };

};

class SA : public Bank
{

    public:
void rofi()
{
    cout << " Rate of interest Applied !! "<<endl;
}
SA()
{
    cout<<" Child's Constructor !! "<<endl;
};

};


class CA : public Bank
{

    public:
void rofi()
{

};

};


 int main()
 {
    SA s1;
    s1.rofi();

    return 0;
 }
// hierarchical inheritance

/*
Abstract class me constructor hota hai ??
jb obj child ka banta hai , child ka constructor chalta hai, child ka constructor parent ke constructor ko call  karta hai;
>>to assign value in private instance member variable of parent class at that tme we need constructor 
in abstract class,
when we create the object of child class at that time child constructor has been called and 
compiler calls the parent constructor
and execute parent constructor and execute
the parent constructor before the child constructor


*/
