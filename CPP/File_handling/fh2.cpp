#include<iostream>
#include<fstream>
using namespace std;

int main ()
{
    // cout<<"File Handling in c++ "<<endl;
    ifstream fin;// used to extract data from file 
    char a;
    fin.open("demo.txt");// >> it stop after space Delimiter;

    while(!fin.eof())
    {

    cout<<a;
    a = fin.get();//read  karne wale pointer ko get pointer kaha jata hai
    };
    fin.close();
    return 0;
};

// put pointer >> data insert karta hai;

// tellg() >> fun ifstream main hota hai
// tellp()>> function ofstream main hota hai
