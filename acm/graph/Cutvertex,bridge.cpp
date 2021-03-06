
using namespace std;
const int MAXN=200001;
vector<vector<int> > adj;
int n,m;
int low[MAXN];
int vis[MAXN];
int cutVertex[MAXN]={0,};
int par[MAXN];
int timer;
vector<pair<int,int> > bridges;
void dfs(int here){
    vis[here]=timer++;
    low[here]=vis[here];
    int child=0;
    for(auto there:adj[here]){
        if(vis[there]==-1){
            par[there]=here;
            dfs(there);
            if(low[there]>=vis[here]){
                cutVertex[here]=1;
                if(low[there]>vis[here]){
                    int u=here,v=there;
                    if(u>v)swap(u,v);
                    bridges.push_back({u,v});
                }
            }
            child++;
            low[here]=min(low[there],low[here]);
        }
        else if(par[here]!=there){low[here]=min(vis[there],low[here]);}
    }
    if(here==0)cutVertex[here]=(child>=2);
}
int main(){
    //ios::sync_with_stdio(false);
    cin.tie(0);
    cin>>n>>m;
    adj.resize(n+1);
    memset(vis,-1,sizeof(vis));
    memset(par,-1,sizeof(par));
    timer=0;
    for(int i=0;i<m;i++){
        int u,v;
        cin>>u>>v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    dfs(0);  // 1부터 출발할지 정함, 또한 그래프가 전부 이어저 잇지 않다면 dfsALL
    int size=0;
    for(int i=0;i<n;i++){
        if(cutVertex[i])size++;
    }
    cout<<size<<"\n";
    int cnt=0;
    for(int i=0;i<n;i++){
        if(cutVertex[i]){
            cnt++;
            cout<<i<<" \n"[cnt==size];
        }
    }
    sort(bridges.begin(),bridges.end());
    cout<<bridges.size()<<"\n";
    for(int i=0;i<bridges.size();i++){
        cout<<bridges[i].first<<' '<<bridges[i].second<<"\n";
    }
    
    return 0;
}
