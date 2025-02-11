#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main()
{
     ios_base :: sync_with_stdio(false);
     cin.tie(nullptr);
     cout.tie(nullptr);
     int t = 1;
     cin >> t;
     while (t--)
     {
        long long n, i;
        cin >> n;
        long long a[n];
        set<long long>s;

        for(i = 0;i<n; i++){
            cin >> a[i];
            s.insert(a[i]);
        }

        if(s.size()==1){
            cout<<n <<endl;
        }
        else{
            cout << 1 <<endl;
        }

     }
     
    return 0;
};