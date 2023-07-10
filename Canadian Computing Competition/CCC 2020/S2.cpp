#include <bits/stdc++.h>
#define int long long
#define String string
#define pii pair<int, int>
#define pb push_back
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MN = 1005, MAX = 1000005;

int n, m, mp[MN][MN], visited[MN][MN];
vector<pii> arr[MAX];
queue<pii> q;

int32_t main() {

    boost();
    cin >> m >> n;
    for (int i=1; i<=m; i++) for (int j=1; j<=n; j++) {
        cin >> mp[i][j];
        arr[mp[i][j]].push_back({i, j});
    }
    visited[m][n] = 1;
    q.push({m, n});
    while (!q.empty()) {
        pii curPos = q.front();
        q.pop();
        int x = curPos.f, y = curPos.s;
        int prod = x * y;
        for (pii nxt : arr[prod]) {
            if (!visited[nxt.f][nxt.s]) {
                visited[nxt.f][nxt.s] = 1;
                q.push(nxt);
            }
        }
    }

    (visited[1][1]) ? cout << "yes\n" : cout << "no\n";

    return 0;
    
}