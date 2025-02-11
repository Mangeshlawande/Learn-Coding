// 1.how many donut you buy from the shop 1 such that it is cheaper than the 2 shop 
// 2. no of donuts i 2nd shop cheaper than  1 sst shop

// x donuts 
// a = price in 1 ; b = no of donuts you  want to buy ; c = price in 2; 
#include <bits/stdc++.h> 
using namespace std;
int main() 
{ 
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    int t=1;
    cin>>t;
        while(t--)
        {
                long long a,b,c;
                cin>>a>>b>>c;
                
                if(a<c)
                cout<<1<<" ";
                else
                cout<<"-1 ";
                
                if(a*b>c)
                cout<<b<<endl;
                else
                cout<<"-1"<<endl;
        }
    return 0; 
} 