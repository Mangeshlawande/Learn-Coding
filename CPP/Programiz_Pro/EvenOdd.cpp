#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter an Integer: "<<endl;
	cin>>n;
	/*
	if(n%2==0)
	cout<< n << " is an Even number."<<endl;
	else
	cout<< n<<" is an odd number."<<endl;
	*/
	// using ternary operator
	(n%2==0) ? cout<< n<<" is even..":cout<<n<<" is odd..";
return 0;
};

