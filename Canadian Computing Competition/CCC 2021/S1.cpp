#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MN = 10005;
int n;
double h[MN], w[MN];

int32_t main() {

    boost();
    
    cin >> n;
    for (int i=0; i<=n; i++) cin >> h[i];
    for (int i=0; i<n; i++) cin >> w[i];

    double ans = 0;

    for (int i=0; i<n; i++) {
        ans += (h[i] + h[i+1]) * w[i] / 2;
    }

    printf("%.6f\n", ans);
    
    return 0;
}