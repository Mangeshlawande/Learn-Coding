#include<iostream>
using namespace std;
const int ARRAY_SIZE = 5;

//DECLARE FUNCTION TO DISPLAY MARKS
// TAKE A 1D ARRAY AS PARAMETER
void display(int m[]) {
cout<<"Displaying Marks: "<<endl;

// display array elements
for(int i = 0;i<ARRAY_SIZE;i++)
{
cout<<"Student "<<i+1<<": "<<m[i]<<endl;
}
}


int main() {

//declare and initialize an array
int marks[ARRAY_SIZE] = {88,86,34,65,34};


// call display function
// pass array as argument

display(marks);
return 0;
}
