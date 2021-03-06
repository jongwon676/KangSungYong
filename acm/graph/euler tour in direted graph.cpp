using namespace std;
const int MAXN=100001;
vector<int> adj[MAXN];
int in[MAXN],out[MAXN];
void dfs(int here){
    while(adj[here].size()){
        int there=adj[here].back();
        adj[here].pop_back();
        dfs(there);
    }
}
bool checkEuler(){
    int plus=0,minus=0;
    for(int i=0;i<MAXN;i++){
        if(in[i]!=out[i]){
            if(abs(in[i]-out[i])>1){
                return false;
            }
            if(in[i]>out[i])minus++;
            if(out[i]>in[i])plus++;
        }
    }
    return (plus==1 && minus==1) ||(plus==0 && minus==0);
}


//컨넥티드컴포넌트가아니라면  오일러패스존재 못함
//시작점을 잘 결정 해주기.(plus==1 && minus==1) ||(plus==0 && minus==0)
