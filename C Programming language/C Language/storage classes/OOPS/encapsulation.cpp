
#include<iostream> 
using namespace std;
/*
Q. How to create an object internally
Encapsulation is defined as the wrapping of data under a single unit,

it is the mechanism that binds tougether code and data it manipulates 
> it is a protective shield that prevents eay the data from being accessed
by the code outside the shield.

Encapsulation:
1. data member should be (private)==> instance variable are declared private
to prevent misuse

>> provide methods that can be used to read / write the state rather 
than accessing the state directly

2. member function (public) :

*/
class KG 
{
    private: int p ,q;
   public: void setP(int input)
   {
       p = input; 
       q =p/2;
   }
};

int main() {
    KG obj;
   obj.setP(6);
      
    return 0;
}


