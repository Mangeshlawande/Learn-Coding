// constructor and 
// constructor and destructor using inherihance in c++

/* 
for Constructor:
calling sequence : child to parent 
Execution sequence : parent to child

For Destructor: // deallocate dynamic memory
calling sequence : child to parent 
Execution sequence : child to parent
*/
#include <iostream>
using namespace std;

class A{
    int s;
    public:
    
    A(int q)
    {
        s = q;
        cout << s <<endl;
        cout<<"Parent Constructor\n";
    }
    ~A()
    {
        cout << "Parent Destructor"<<endl;
    }
};

class B :public A 
{
    public :
    B(int p): A(p)
    // B() : A() //--> internal working 
    {
        cout <<"Child Constructor\n";
    };
    ~B()
    {
        cout << "Child Destructor"<<endl;
        // ~A();// no need to write
    };
};


int main ()
{
    B b1(8);
return 0;
};
