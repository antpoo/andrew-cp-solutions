#include <bits/stdc++.h>
#define int long long
using namespace std;

const int MN = 100005;
int n, a[MN], b[MN];

signed main() {
    
    cin >> n;
    for (int i=1; i<=n; i++) cin >> a[i];
    for (int i=1; i<=n; i++) cin >> b[i];
    
    int asum = 0, bsum = 0;
    int ans = 0;
    for (int i=1; i<=n; i++) {
        asum += a[i];
        bsum += b[i];
        if (asum == bsum) ans = i;
    }
    
    cout << ans << '\n';
    
    return 0;
}