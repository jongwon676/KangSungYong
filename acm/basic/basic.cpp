#include <iostream>
#include <cstdio>
#include <string>
#include <sstream>
#include <algorithm>
#include <set>
#include <numeric>
#include <cmath>
#include <map>
#include <vector>
#include <queue>
#include <stack>
#include <cstring>
#include <queue>
#include <numeric>
#include <iomanip>
#define ll long long
using namespace std;
// for(int p=Set;p;p=(p-1)&Set)  부분집합원소순회
//cout<<fixed<<setprecision(11)<<(double)m/z<<"\n";
int Gcd(int a,int b){
    if(b==0)return a;
    return Gcd(b,a%b);
} //오버플로우조심
int Lcm(int a,int b){
    return (a*b)/Gcd(a,b);
}//오버 플로우 조심
const int MAXN=200001;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout<<Lcm(22,33);
    return 0;
}

