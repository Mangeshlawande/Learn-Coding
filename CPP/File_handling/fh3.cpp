#include<iostream>
#include<fstream>
using namespace std;


int main ()
{

    ofstream fout;
    fout.open("demo.txt", ios::app | ios :: ate);//| ios :: ate
    // fout <<"Nashik";
    cout<<fout.tellp()<<endl;

// tellg() & tellp()
    fout.close();
    return 0;
};
// in append mode it start from 0; 