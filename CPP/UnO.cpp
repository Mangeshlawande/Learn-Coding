#include <iostream>
using namespace std;

// class UnaryO{
//     int x,y;
//     public:
//     void setData(int p, int q)
//     {
//         x = p;
//         y = q;
//     };

// UnaryO operator -()
// {
//     UnaryO v1;
//     v1.x = -x;
//     v1.y = -y;
//     return v1;
// }

// void display()
// {
//  cout<<x<<" "<<y<<endl;
// }
// };


// int main()
// {
//     UnaryO u1,u2;
//     u1.setData(4,5);
//     u2 = -u1; // u2 = u1.-();
//     u2.display();
//     return 0;
// }


//  post increment operator 
// post increment main int argument ke roop main pass karna padta;

class Increment{
    int x,y;
    public:
    void setData(int p, int q)
    {
        x = p;
        y = q;
    };

Increment operator ++(int)
{
    Increment v1;
    v1.x = x++;
    v1.y = y++;
    return v1;
}

void display()
{
 cout<<x<<" "<<y<<endl;
}
};


int main()
{
    Increment i1,i2;
    i1.setData(4,5);
    // i2 = ++i1  ; 

    // i2 = i1.++();
    i2 = i1++;
    i2.display();
    return 0;
}

// pre increment
// class Increment{
//     int x,y;
//     public:
//     void setData(int p, int q)
//     {
//         x = p;
//         y = q;
//     };

// Increment operator ++()
// {
//     Increment v1;
//     v1.x = ++x;
//     v1.y = ++y;
//     return v1;
// }

// void display()
// {
//  cout<<x<<" "<<y<<endl;
// }
// };


// int main()
// {
//     Increment i1,i2;
//     i1.setData(4,5);
//     i2 = ++i1  ; 
//     // i2 = i1.++();
//     i2.display();S
//     return 0;
// }