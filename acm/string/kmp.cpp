#define ll long long
using namespace std;
vector<int> strings;
vector<int> pre(string pattern){ //전처리
    int m=pattern.size();
    vector<int> pi(m);
    int j=0;
    pi[0]=0;
    for(int i=1; i<m; i++){
        while(j>0  &&  pattern[i]!=pattern[j])
        j=pi[j-1];
        if(pattern[i] == pattern[j]){ pi[i]=j+1;  j++; }
        else { pi[i]=0;  }
    }
    return pi;
}

vector<int> kmp(string s, string pattern){
    vector<int> pi=pre(pattern);
    vector<int> ans;
    int n=s.size();  int m=pattern.size();  int j=0;
    for(int i=0; i<n; i++){
        while(j>0  &&  s[i]!=pattern[j]){
            j=pi[j-1];
        }
        if(s[i] == pattern[j]){
            if(j == m-1){
                ans.push_back(i-m+1);
                j=pi[j];
            }
            else{
                j++;
            }
        }
    }
    return ans;
}
