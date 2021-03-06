#include <iostream>
#include <cstdio>
#include <string>
#include <algorithm>
#include <set>
#include <map>
#include <vector>
#include <queue>
#include <cstring>
#include <stack>

using namespace std;
int sccId[200001];
int disCovered[200001];
int sccNumber;
int vertexNumber;
int n,e;
stack<int> st;
vector<vector<int> > adj;
int dfs(int here){
    int there;
    st.push(here);
    disCovered[here]=vertexNumber++;
    int ret=disCovered[here];
    for(int i=0;i<adj[here].size();i++){
        there=adj[here][i];
        if(disCovered[there]==-1)
        ret=min(dfs(there),ret);
        else if(sccId[there]==-1)
        ret=min(ret,disCovered[there]);
    }
    if(ret==disCovered[here]){
        while(true){
            int num=st.top();st.pop();
            sccId[num]=sccNumber;
            if(num==here)
            break;
        }
        sccNumber++;
    }
    return ret;
}
void dfsAll(){
    for(int i=1;i<=n;i++)
    if(disCovered[i]==-1)
    dfs(i);
}

int main(){
    cin>>n>>e;  //버텍스 개수 ,엣지 개수
    int v1,v2;  //버텍스1,버텍스2
    memset(sccId,-1,sizeof(sccId));
    memset(disCovered,-1,sizeof(disCovered));
    sccNumber=0;vertexNumber=0;
    adj.resize(n+1);
    for(int i=0;i<e;i++){
        cin>>v1>>v2;
        adj[v1].push_back(v2);
    }
    dfsAll();
    
    
    return 0;
}

