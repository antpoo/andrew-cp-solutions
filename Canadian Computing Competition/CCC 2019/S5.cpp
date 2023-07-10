#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

vector<vector<int>> triangle;
int n, k;

void solve(int size) {
    if (size == 1) return;
    int sub_size = (2 * size + 2) / 3;
    if (size == 2) sub_size = 1;
    solve(sub_size);
    for (int i=0; i<=n-size; i++) {
        for (int j=0; j<=i; j++) {
            triangle[i][j] = max(triangle[i][j], max(triangle[i + size - sub_size][j], triangle[i + size - sub_size][j + size - sub_size]));
        }
    }
}

int32_t main() {

    boost();

    cin >> n >> k;
    triangle.resize(n);
    for (int i=0; i<n; i++) {
        for (int j=0; j<=i; j++) {
            int x; cin >> x;
            triangle[i].push_back(x);
        }
    }
    solve(k);
    int ans = 0;
    for (int i=0; i<=n-k; i++) for (int j=0; j<=i; j++) ans += triangle[i][j];
    cout << ans << '\n';
    
    return 0;
}