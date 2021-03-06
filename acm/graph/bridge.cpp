const int MAXN=400005;
int parent[MAXN],par[MAXN],low[MAXN],dfn[MAXN],t=0,isBridge[MAXN],sz[MAXN];
pair<int,int> pt[MAXN],as[MAXN];
vector<pair<int,int> > adj[MAXN];
vector<pair<int,int> > tree[MAXN];
int find(int u){
    return u==parent[u] ? u : parent[u]=find(parent[u]);
}
void mrg(int u,int v){
    u=find(u),v=find(v);
    if(u==v)return;
    parent[u]=v; sz[v]+=sz[u];
}
void dfs(int here){
    ++t;
    low[here]=dfn[here]=t;
    for(int i=0;i<adj[here].size();i++){
        int there=adj[here][i].first;
        if(!dfn[there]){
            par[there]=here;
            dfs(there); //tree edge bridge 가능성 있음
            low[here]=min(low[here],low[there]);
            if(low[there]>dfn[here]) isBridge[adj[here][i].second]=1;
        }
        else if(par[here]!=there) low[here]=min(low[here],dfn[there]);
    }
}
int main(){
    ios::sync_with_stdio(false); cin.tie(0);
    int n,m; cin>>n>>m;
    for(int i=1;i<=m;i++){
        cin>>pt[i].first>>pt[i].second;
        adj[pt[i].first].push_back({pt[i].second,i});
        adj[pt[i].second].push_back({pt[i].first,i});
    }
    for(int i=1;i<=n;i++)parent[i]=i,sz[i]=1;
    dfs(1);
    for(int i=1;i<=m;i++)
    if(!isBridge[i])
    mrg(pt[i].first,pt[i].second);
    for(int i=1;i<=m;i++){
        if(isBridge[i]){
            int u=pt[i].first; int v=pt[i].second;
            tree[find(u)].push_back({find(v),i});
            tree[find(v)].push_back({find(u),i});
        }
    }
    return 0;
}
