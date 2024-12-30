#include <iostream>
using namespace std;


class Demo
{
    int x, y;
    public :
    int z=9;
    static int s;

    void setData(int p, int q){
        x = p;
        y = q;
        int r;
        r = 90;//local variable
        cout<< r<<endl;

    };

    void display(){
        cout <<x<<" "<< y <<endl;
    };

};
int Demo :: s=98;


int main ()
{
    Demo d1;
    d1.setData(3,4);
    d1.display();
    cout<<d1.z<<endl;
    // cout<< Demo ::s;

    return 0;
};