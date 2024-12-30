#include<iostream>
using namespace std;

/*
destructor :
destructor called at end of object ;

*/
class Exam
{
    int x, y ; //by default it contain garbage value 
    public:
    ~Exam()
    {
        cout <<"destructor"<<endl;
    };

    Exam(int p, int q){
        x = p; 
        y = q;
    };
// Exam(Exam g)  infinite loop
    Exam(Exam &g1)// refer e1 --> reference variable
    // copy constructor
    {
        g1.x++;
        g1.y++;
        // cout<<g1.x<<endl;
        // cout<<g1.y<<endl;
    }
    void display(){
        cout<<x<<endl;
        cout<<y<<endl;

    };
};
int main() 
{
    Exam e1(6,7);
    // e2(33,45);
    Exam e3(e1);
    e1.display();
    return 0;
};