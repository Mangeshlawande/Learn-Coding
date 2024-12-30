#include <iostream>
using namespace std;

int main()
{
double numbers[] = {7,5,8,2,5,9,3};

double sum = 0;
double count = 0;
double average ;
cout<<"The nnumbers are : ";

// print array elements
// use of range-based for loop
for(const double &n : numbers){
cout<<n<<" ";
// calculate the sum 
sum+= n;

//count the number'd of array elements
count++;
}
// print the sum 
cout <<"\ntheir Sum = " <<sum<<endl;

//find The average 
average = sum/count;
cout <<"Their Average : "<<average <<endl;


return 0;
}

