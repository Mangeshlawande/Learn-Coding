// #include<iostream>
// using namespace std;

// class A
// {
//     int a, b, c,r;

//     public:

// int f1(int x, int y)
// {
//  a = x;
//  b = y;
//  r = a + b;
//  return r;
// };

// int f1(int x , int y , int z)
// {
//     a = x;
//     b = y;
//     c = z; 
//     r = a + b + c;
//     return r;

// };

// void display()
// {
//  cout <<"The result is :"<<r<<endl;
// }
// };

// int main()
// {
//     A o1, o2,o3,o4;
//     // int r1,r2;s
//    o3 = o1.f1(2,4);
//    o2=  o1.f1(2,3,4);




//     return 0;
// };



#include <iostream>
using namespace std;

class A {
private:
    int a, b, c, r;

public:
    // Function to calculate sum of two integers
    int f1(int x, int y) {
        a = x;
        b = y;
        r = a + b;
        return r;
    }

    // Function to calculate sum of three integers
    int f1(int x, int y, int z) {
        a = x;
        b = y;
        c = z; 
        r = a + b + c;
        return r;
    }

    // Function to display result
    void display() {
        cout << "The result is: " << r << endl;
    }
};

int main() {
    A o1, o2, o3, o4;

    int result1 = o1.f1(2, 4);     // Call f1(int, int) and store the result
    int result2 = o1.f1(2, 3, 4);  // Call f1(int, int, int) and store the result

    // Display results
    cout << "Result 1: " << result1 << endl;
    cout << "Result 2: " << result2 << endl;

    return 0;
}
