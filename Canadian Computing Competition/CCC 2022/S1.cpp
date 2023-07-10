#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;


int32_t main() {

    boost();
    
    int n; cin >> n;
    int ans = 0;
    while (n >= 0) {
        if (n % 4 == 0) ans++;
        n -= 5;
    }
    cout << ans << '\n';
    
    return 0;
}