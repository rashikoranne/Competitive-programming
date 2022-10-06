#include <iostream>
#include <list>
using namespace std;
//https://www.codechef.com/START59D/problems/SUSSTR

int main(){
    int t;
    cin>>t;

    while (t--)
    {
        int n;
        cin>>n;
        char s[n];
        for (int i = 0; i < n; i++)
        {
            cin>>s[i];
        }

        int le=0,ri=n-1;

        list<char> lf;

        for (int i = 0; i < n; i++)
        {
            if(i%2==0){
                if(s[le]=='0'){
                    lf.push_front(s[le]);

                }else if (s[le]=='1'){
                    lf.push_back(s[le]);
                }
                le++;
            }else{
                if(s[ri]=='0'){
                    lf.push_back(s[ri]);
                }else if(s[ri]=='1'){
                    lf.push_front(s[ri]);
                }
                ri--;
            }
            }
        for (auto it = lf.begin(); it != lf.end(); it++)
         cout << *it;

    cout<<endl;
    }

    return 0;
}
