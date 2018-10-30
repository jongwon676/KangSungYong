#include <iostream>
#include <cassert>
#include <cstring>
#include <vector>
using namespace std;
const int MAXN = 400001; //알아서 사이즈 조절 2-sat * 2 조심
int n,m;
struct twoSat{
    vector<int> adj[MAXN],rev[MAXN];
    vector<int> dfn;
    int vis[MAXN],sccId[MAXN],n,id;
    void addEdge(int u,int v){
        adj[u].push_back(v);
        rev[v].push_back(u);
    }
    void init(int n){
        this->n = n;
        dfn.clear()
        memset(vis,0,sizeof(vis));
        memset(sccId,0,sizeof(sccId));
        for(int i = 0; i < MAXN; i++){
            adj[i].clear(); rev[i].clear();
        }
        id = 0;
    }
    void dfs(int here){
        vis[here] = 1;
        for(auto &there: adj[here]){
            if(!vis[there]) dfs(there);
        }
        dfn.push_back(here);
    }
    void rdfs(int here,int cc){
        vis[here] = 1;
        sccId[here] = cc;
        for(auto &there : rev[here]){
            if(!vis[there]) rdfs(there,cc);
        }
    }
    void solve_scc(){
        for(int i = 0; i < n; i++){
            if(!vis[i]) dfs(i);
        }
        memset(vis,0,sizeof(vis));
        for(int i = (int)dfn.size()-1; i >= 0; i--){
            int x = dfn[i];
            if(!vis[x]) rdfs(x, ++id);
        }
    }
}ts;

int main(){
    ios::sync_with_stdio(false); cin.tie(0);
    //ts.init(2*n) //2-sat은 노드개수 2배 생기니 조심
    
    
    
    
    //ts.solve_scc()
    
    
    
}

