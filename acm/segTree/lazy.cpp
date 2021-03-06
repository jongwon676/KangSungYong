#include <vector>
#include <iostream>
#include <algorithm>
#include <string>

#define ll long long

using namespace std;
const int MAXN=200001;
long long arr[MAXN];
int l,r,x,n,m;
struct segTree{
    vector<long long > tree,lazy,mn;
    void init(int n){
        tree.resize(4*n+1,0); lazy.resize(4*n+1,0); mn.resize(4*n+1,0);
    }
    void push(int node,int st,int ed){
        tree[node]+=(lazy[node]*(ed-st+1));
        mn[node]+=lazy[node];
        if(st!=ed){lazy[node*2]+=lazy[node]; lazy[node*2+1]+=lazy[node];}
        lazy[node]=0;
    }
    void update(int node,int st,int ed,int l,int r,ll val){
        push(node,st,ed);
        if(st> r || ed<l)return;
        if(st>=l && ed<=r){
            lazy[node]+=val; push(node,st,ed);
            return;
        }
        update(node*2,st,(st+ed)/2,l,r,val);
        update(node*2+1,(st+ed)/2+1,ed,l,r,val);
        tree[node] = tree[node*2]+tree[node*2+1];
        mn[node] =min(mn[node*2],mn[node*2+1]);
    }
    pair<ll,ll> query(int node,int st,int ed,int l,int r){ //first min, sum
        push(node,st,ed);
        if(st>r || ed<l)return {1e18,0}; //에러 나면 make_pair 함해보기 , 1e18이 충분히큰가 생각해보기
        if(st>=l && ed<=r)
        return {mn[node],tree[node]};
        auto L = query(node*2,st,(st+ed)/2,l,r);
        auto R = query(node*2+1,(st+ed)/2+1,ed,l,r);
        return make_pair(min(L.first,R.first),L.second+R.second);
    }
}seg;
int main(){
    ios::sync_with_stdio(false); cin.tie(0);
    cin>>n>>m;
    seg.init(n);
    return 0;
}
