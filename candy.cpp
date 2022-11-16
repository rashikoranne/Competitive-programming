#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    map<int, int> distinct;
	    for(int i = 0; i<2*n; i++){
	        int a;
	        cin>>a;
	        distinct[a]++;
	    }
	    int x = 0;
	    int y = 0;
	    for(auto i: distinct){
	        if(i.second == 1)x++;
	        else if(i.second == 2)y++;
	    }
	    if(x + 2*y == 2*n){
	    cout<<"YES"<<endl;
	        
	    }
	    else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
