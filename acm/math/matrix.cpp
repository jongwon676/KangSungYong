#define ll long long
using namespace std;

typedef vector<vector<ll> > matrix;

const ll mod=1e9+7;
ll a[102],b[102],c[102];
matrix unit(ll n) {
    matrix ret(n, vector<ll>(n));
    for (ll i = 0; i < n; i++)
    ret[i][i] = 1;
    return ret;
}

matrix matrixAdd(const matrix &a, const matrix &b) {
    ll n = a.size();
    ll m = a[0].size();
    matrix ret(n, vector<ll>(m));
    for (ll i = 0; i < n; i++)
    for (ll j = 0; j < m; j++)
    ret[i][j] = (a[i][j] + b[i][j]) % mod;
    return ret;
}

matrix matrixMul(const matrix &a, const matrix &b) {
    ll n = a.size();
    ll m = a[0].size();
    ll k = b[0].size();
    matrix ret(n, vector<ll>(k));
    for (ll i = 0; i < n; i++)
    for (ll j = 0; j < k; j++)
    for (ll p = 0; p < m; p++)
    ret[i][j] = (ret[i][j] + (long long) a[i][p] * b[p][j]) % mod;
    return ret;
}

matrix matrixPow(const matrix &a, ll p) {
    if (p == 0)
    return unit(a.size());
    if (p & 1)
    return matrixMul(a, matrixPow(a, p - 1));
    return matrixPow(matrixMul(a, a), p / 2);
}
int main(){
    ios::sync_with_stdio(false);
    ll testCase;
    testCase=1;
  
//    matrix before(c[1]+1,vector<ll>(1));
    
}
