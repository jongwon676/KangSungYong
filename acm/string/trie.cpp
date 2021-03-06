const int MAXN = 3e5+3;
const int MAX_WORD = 26;
int trie[MAXN][MAX_WORD],n,id = 0,term[MAXN],mat[26][26],in[26]; //trie 주의사항 총문자열의 합만큼 저장
string s[MAXN];
void add_word(int node,string &s,int idx){
    if(idx == s.size()){
        term[node] = 1;
        return;
    }
    int word = s[idx] - 'a';
    if(trie[node][word] == -1) trie[node][word] = ++id;
    add_word(trie[node][word],s,idx+1);
}
int go(int node,string &s,int idx){
    if(idx == s.size()) return 1;
    if(term[node]) return 0;
    int word = s[idx] - 'a';
    for(int i = 0; i < 26; i++){
        if(word == i || trie[node][i] == -1) continue;
        mat[word][i] = 1;
    }
    return go(trie[node][word],s,idx+1);
}
bool cycleExist(){
    queue<int> q;
    int cnt = 0;
    for(int i = 0; i <26; i++){
        for(int j = 0; j < 26; j++){
            if(mat[i][j]) in[j]++;
        }
    }
    for(int i = 0; i < 26; i++) if(in[i] == 0) q.push(i);
    while(!q.empty()){
        int here = q.front();
        q.pop();
        cnt++;
        for(int i = 0; i < 26; i++){
            if(mat[here][i]){
                in[i]--;
                if(in[i] == 0) q.push(i);
            }
        }
    }
    return cnt != 26;
}

int main(){
    ios::sync_with_stdio(false); cin.tie(0);
    cin >> n;
    memset(trie,-1,sizeof(trie));
    return 0;
}
