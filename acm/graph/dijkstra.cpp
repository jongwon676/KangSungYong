const int MAXN=500000;  //수정
vector<pair<int, int> > adj[MAXN];  //first == 도착노드 second 해당엣지의 길이
int dist[MAXN];
int n;
void dijkstra(int st){
    for(int i=0; i<MAXN; i++)dist[i]=2e9;   //inf값 그때그째 잘 맞춰서 수정하기
    dist[st]=0;
    priority_queue<pair<int, int> > pq;
    pq.push(make_pair(0, st));
    while(!pq.empty()){
        int cost=-pq.top().first;
        int here=pq.top().second;
        pq.pop();
        if(dist[here]<cost)continue;
        for(auto node: adj[here]){
            int there=node.first;
            int next=cost+node.second;
            if(dist[there]>next){
                dist[there]=next;
                pq.push(make_pair(-next, there));
            }
        }
        
    }
}
/*
 int main(){
 
 return 0;
 }
 */
