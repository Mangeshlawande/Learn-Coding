// #include<iostream>
// #include<fstream>
// using namespace std;

// int main()
// {
//     ifstream fin; 
//     char a;
//     fin.open("demo.txt");
//     a=fin.get();
//     a=fin.get();
//     a=fin.get();
//     a=fin.get();
//     cout<<fin.tellg()<<endl;;
//     while(!fin.eof())
//     { 
//         cout<<a;
//         a = fin.get();
//     }
//     cout<<endl;
//     fin.close();

//     return 0;
// };

//iso::dat

// seek = change karna

#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    ifstream fin; 
    char a;
    fin.open("demo.txt");
    a=fin.get();

    cout<<fin.tellg()<<endl;;
    while(!fin.eof())
    { 
        cout<<a;
        a = fin.get();
    }
    cout<<endl;
    fin.close();

    return 0;
};