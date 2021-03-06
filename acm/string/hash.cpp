#define ll long long
using namespace std;
const int MAXN=2000002;
long long hash1[MAXN],hash2[MAXN];
long long pw1[MAXN],pw2[MAXN];
long long mod1=1e9+7,mod2 = 1e9+9;
long long base=256;
string s;
long long getHash(int pos,int len,long long hash[MAXN],long long mod,long long pw[MAXN]){   //pos부터 시작해 길이가 len인 hash
    // pos+len<=n 여야됨
    long long r = hash[pos+len-1];
    if(pos==0)return r;
    long long l = (hash[pos-1]*pw[len])%mod;
    long long h = (r-l+100000*mod)%mod; //* 하는값이 너무 큰거 아닌가? 아마 될듯
    return h;
}
void fill_hash(long long hash[MAXN],long long mod,long long pw[MAXN]){
    hash[0]=s[0];
    pw[0]=1;
    for(int i=1;i<s.length();i++){
        pw[i] = pw[i-1]*base; pw[i]%=mod;
    }
    for(int i=1;i<s.length();i++){
        hash[i] = hash[i-1]*base +s[i];
        hash[i]%=mod;
    }
}
int main(){
    ios::sync_with_stdio(false); cin.tie(0);
    cin>>s;
    base=256; mod1=1e9+7; mod2=1e9+9;
    fill_hash(hash1,mod1,pw1);
    fill_hash(hash2,mod2,pw2);
    cout<<getHash(0,s.length(),hash1,mod1,pw1);  //0부터 시작한 길이가 string 길이와 같은 해쉬
    cout<<getHash(1,3,hash1,mod1,pw2); // [1:3] hash
    
    return 0;
}
