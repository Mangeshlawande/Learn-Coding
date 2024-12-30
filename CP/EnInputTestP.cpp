/*
input : the input begin with 2 positive integer
n, k (n,k<-107), the  next n lines of input contain one positive integers t, not grater than 10^9,
each.

OUTPUT:
write a single integer to output , denoting how many integer t, are divisible by k

Example:
7 3
1
51
966369
*/

#include <iostream>

using namespace std;

int main()
{
    int n, k;
    // cout << "Enter the number of inputs:" << endl;
    cin >> n;
    // cout << "Number to divide :" << endl;
    cin >> k;
    int total = 0;
    for (int i = 0; i < n; i++)
    {

        long long int t;
        cin >> t;
        if (t % k == 0)
        {
            total++;
        }
        else
        {
            total = total;
        }
    }
    cout << total<<endl;
    return 0;
};