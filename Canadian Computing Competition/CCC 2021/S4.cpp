#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MN = 200005;
int n, w, d, a, b, x, y, step[MN], train[MN];
vector<int> adj[MN];
queue<int> q;
multiset<int> ms;

int32_t main() {

    boost();
    
    cin >> n >> w >> d;
    for (int i=0; i<w; i++) {
        cin >> a >> b;
        adj[b].push_back(a);
    }

    for (int i=1; i<n; i++) step[i] = INT32_MAX;

    q.push(n);
    while (!q.empty()) {
        int cur = q.front();
        q.pop();
        for (int nxt : adj[cur]) {
            if (step[nxt] > step[cur] + 1) {
                step[nxt] = step[cur] + 1;
                q.push(nxt);
            }
        }
    }

    for (int i=1; i<=n; i++) {
        cin >> train[i];
        ms.insert(step[train[i]] + i - 1);
    }

    for (int i=0; i<d; i++) {
        cin >> x >> y;
        int x_time = step[train[x]] + x - 1;
        int y_time = step[train[y]] + y - 1;
        ms.erase(ms.find(x_time));
        ms.erase(ms.find(y_time));
        swap(train[x], train[y]);
        ms.insert(step[train[x]] + x - 1);
        ms.insert(step[train[y]] + y - 1);
        cout << *ms.begin() << '\n';
    }

    return 0;
}