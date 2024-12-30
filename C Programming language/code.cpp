#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int binToDec(int bin){
int ans =0, pow =1;

while(bin>0){
    int rem = bin % 10;
    ans = ans + (rem * pow);

    bin = bin /10;
    pow = pow *2;   
}
return ans ;
}

int main ()
{
    int num;
    cout << "Enter Binary NUmber : ";
    cin >> num;
cout << binToDec(num)<< endl;

return 0;
}