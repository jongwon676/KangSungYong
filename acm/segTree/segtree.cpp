#include <cstdio>
#define  ll long long
ll tree[1<<24], n, base; //n 원소의개수,base단말노드의 개수
ll query(ll l, ll r)
{
    ll sum=0;
    for(l+=base-1,r+=base-1; l<=r; l>>=1,r>>=1){
        if(l&1) sum+=tree[l++]; //홀수 일때
        if(~r&1) sum+=tree[r--]; //짝수 일때
    }
    return sum;
}
void update(ll idx, ll value)
{
    for(tree[idx+=base-1]=value;idx>1;idx>>=1)
        tree[idx>>1]=tree[idx]+tree[idx^1];
}
/*int main()
{
    for(base=1; base<n; base*=2);
    for(ll i=base; i<n+base; i++)
        scanf("%lld", &tree[i]);
}*/