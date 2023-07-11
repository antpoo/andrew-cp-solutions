#include <bits/stdc++.h>
using namespace std;

const int MN = 100005;
int n, m, a, b, x, longest_dist, furthest_node;
bool pho[MN];
vector<int> adj[MN];

void dfs1(int cur, int par) {
    for (int nxt : adj[cur]) {
        if (nxt == par) continue;
        dfs1(nxt, cur);
        if (pho[nxt]) pho[cur] = 1;
    }
}

void dfs2(int cur, int par, int dist) {
    if (dist > longest_dist) {
        longest_dist = dist;
        furthest_node = cur;
    }

    for (int nxt : adj[cur]) {
        if (pho[nxt] && nxt != par) {
            dfs2(nxt, cur, dist + 1);
        }
    } 
}

int main() {

    cin >> n >> m;
    for (int i=0; i<m; i++) {
        cin >> x;
        pho[x] = 1;
    }

    for (int i=0; i<n-1; i++) {
        cin >> a >> b;
        adj[a].push_back(b);
        adj[b].push_back(a);
    }

    dfs1(x, -1);

    dfs2(x, -1, 0);
    dfs2(furthest_node, -1, 0);

    int cnt = 0;
    for (int i=0; i<n; i++) cnt += pho[i];

    cout << (cnt - 1) * 2 - longest_dist << '\n';


    return 0;

}