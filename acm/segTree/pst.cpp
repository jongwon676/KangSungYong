
#include <iostream>
#include <vector>
#include <algorithm>
#include <cassert>
using namespace std;
const int MAXN = 200005;
int n,in[MAXN],out[MAXN],step = 0,m,q,root[MAXN],dep[MAXN],fact[MAXN];
struct persistent{
    vector<int> tree,L,R;
    int id;
    void init(int n){
        id = 0;
        tree.resize(n * 35,0);
        L.resize(n * 35,0);
        R.resize(n * 35,0);
    }
    int update(int prv,int st,int ed,int pos,int val){
        if(st > pos || ed < pos)return prv;
        int cur = ++id;
        if(st == ed){
            tree[cur] = tree[prv] + val;
            return cur;
        }
        L[cur] = update(L[prv],st,(st+ed)/2,pos,val);
        R[cur] = update(R[prv],(st+ed)/2+1,ed,pos,val);
        tree[cur] = tree[L[cur]] + tree[R[cur]];
        return cur;
    }
    int query(int node,int st,int ed,int l,int r){
        if(st > r || ed < l) return 0;
        if(st >= l && ed <= r) return tree[node];
        return query(L[node],st,(st+ed)/2,l,r) + query(R[node],(st+ed)/2+1,ed,l,r);
    }
}pst;

int main(){
    ios::sync_with_stdio(false); cin.tie(0);
    cin >> n;
    //    pst.init(n);
    return 0;
}





