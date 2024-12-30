#include<iostream>
using namespace std;

class Samsung1
{
    int x,y;
    public:
    void f1()
    {
        x = 5;
    };
    void f2() 
    {
        y = 12;
    };

};

class Samsung2 : public Samsung1 
{
    int z =90;
    public:
     void f3()
    {
        // z = 3;
    };
    void f4()
    {
        cout<<z<<endl;
        // cout <<x<< " "<< y<< " "<<z<<endl;//cant access x and y; its private 
    }
};

class Samsung3 : public Samsung2
{
    int z =90;
    public:
     void f5()
    {
        // z = 3;
    };
};
int main()
{

    Samsung2 s1;
    s1.f1();
    s1.f2();
    s1.f3();
    s1.f4();
    
    return 0;
}