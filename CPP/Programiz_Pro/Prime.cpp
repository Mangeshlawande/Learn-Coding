#include<iostream>
using namespace std;

int main() {
	int i, n;
	bool is_prime = true;
	
	cout<<"Enter a positive integer :"<<endl;
	cin>>n;

	//assuming 0 and 1 are not prime numbers
	if(n==0 || n==1){
	is_prime = false;
	}
	
	// loop to check if n is prime numbers
	for(i =2; i<=n/2;i++)
	{
	if (n%i==0)
	{
	is_prime= false;
	break;
	}
	}
	if (is_prime)
	cout<< n<<" is a prime number"<<endl;
	else
	cout<< n << "is not prime number "<<endl;
	
return 0;
}
