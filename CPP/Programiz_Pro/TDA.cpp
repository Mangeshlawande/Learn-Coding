#include<iostream>
using namespace std;

int main ()
{
int i, numbers[3][4], j;
cout <<"Enter 6 numbers :"<<endl;
//storing userinput in the array
for (i = 0; i<2;i++)
{
for(j=0;j<3; j++){
cin>>numbers[i][j];
}
}
cout<<"The Number's are :"<<endl;
//printing array elements
for(i=0;i<2;i++)
{
for(j=0; j<3;j++)
{
cout<<"numbers["<<i<<"]["<<j<<"]: "<<numbers[i][j]<<endl;
}
}
cout<<"The Matrix are:"<<endl;
for(i=0;i<2;i++)
{
for(j=0; j<3;j++)
{
cout<<numbers[i][j]<<"\t";
}
cout<<endl;
}
return 0;
};

