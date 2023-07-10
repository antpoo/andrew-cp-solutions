#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MN = 5000005;

int m, n, k, x, ans, row[MN], col[MN]; 
char d;

int32_t main() {

    boost();
    
    cin >> m >> n >> k;
    while (k--) {
        cin >> d >> x;
        if (d == 'R') row[x]++;
        else col[x]++;
    }

    for (int i=1; i<=m; i++) {
        for (int j=1; j<=n; j++) {
            int brushes = row[i] + col[j];
            if (brushes % 2) ans++;
        }
    }

    cout << ans << '\n';
    
    return 0;
}