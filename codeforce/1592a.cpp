#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int tc; cin>>tc;
    while(tc--)
    {
        int n,h; cin>>n>>h;
        int a[n]; for(int i=0; i<n; ++i) cin>>a[i];
        sort(a, a+n);
        int x = a[n-1];
		int y = a[n-2];
		if (h%(x+y)==0) cout<<2*(h/(x+y));
 
		else if (h%(x+y)<=x) cout<<2*(h/(x+y))+1;
 
		else cout <<2*(h/(x+y))+2;
 
		cout<<endl;
 
 
 
    }
    return 0;
}