#include<iostream>
#include<bits/stdc++.h>
using namespace std;
#define ll long long


// B. Team Composition: Programmers and Mathematicians

int main()
{
    ios_base :: sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    int t = 1;
    cin >> t;
    while(t--){

        ll a,b;
        cin >> a>>b;
        cout << min(min(a,b),(a+b)/4) <<endl;
    }
     
    return 0;
};