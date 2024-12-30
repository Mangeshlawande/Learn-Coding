#include<iostream>
#include<fstream>
using namespace std;

int main ()
{
    cout<<"File Handling in c++ "<<endl;
    ofstream fout;// use hota hai rakhne ke lliye hoata  hai;
    fout.open("demo.txt");
    fout<<"Hello Rutik !!"<<endl;
    fout.close();
    return 0;
};