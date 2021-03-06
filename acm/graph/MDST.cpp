using namespace std;
const int MAXN=2005; //노드 개수는 가상의 노드까지 포함한 노드개수이기때문에 엣지개수에 영향을 받음
int mat[MAXN][MAXN];
int n,m,sz;
void floyed(){
    for(int k=1;k<=sz;k++)for(int i=1;i<=sz;i++)for(int j=1;j<=sz;j++){
        mat[i][j]=min(mat[i][j],mat[i][k]+mat[k][j]);
    }
}
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int T; cin>>T;
    int t=0;
    while(T--){
        t++;
        cin>>n>>m;
        sz=n;
        for(int i=1;i<MAXN;i++)for(int j=1;j<MAXN;j++)mat[i][j]=1e9;
        for(int i=1;i<=m;i++){
            int u,v; cin>>u>>v;
            u++,v++;
            ++sz;
            mat[u][sz]=1;
            mat[v][sz]=1;
            mat[sz][u]=1;
            mat[sz][v]=1;
        }
        for(int i=1;i<=sz;i++)mat[i][i]=0;
        floyed();
        int diameter=1e9;
        for(int i=1;i<=sz;i++){  //
            vector<int> path;
            for(int j=1;j<=n;j++)path.push_back(mat[i][j]);  //거리 갱신할때는 가상노드가 아닌녀석만 집어넣어주기
            sort(path.begin(),path.end(),greater<int>());
            diameter =min(path[0]+path[1],diameter);
            path.clear();
        }
        cout<<"Case #"<<t<<":\n";
        cout<<diameter/2<<"\n\n";
        
    }
    return 0;
}


/*
 spanning tree
 
 minimum diameter spanning tree(mdst) 구하는법
 엣지사이에 가상의 노드를 넣어줌
 floyed돌린후   가장 길이가 긴 dist[i][j]를 2개 더해줌
 i=가상의 노드+그냥 노드
 j=무조건 그냥 노드
 
 */
