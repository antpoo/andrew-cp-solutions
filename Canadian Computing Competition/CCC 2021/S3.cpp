#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MN = 200005;
int n, p[MN], w[MN], d[MN];

int time(int pos) {
    int time = 0;
    for (int i=0; i<n; i++) {
        int l_range = p[i] - d[i];
        int r_range = p[i] + d[i];
        if (pos >= l_range && pos <= r_range) continue;
        int basg = l_range;
        if (abs(l_range - pos) > abs(r_range - pos)) basg = r_range;
        time += w[i] * abs(pos - basg);
    }
    return time;
}

int32_t main() {

    boost();
    
    cin >> n;
    int l = INT32_MAX, r = 0;
    for (int i=0; i<n; i++) {
        cin >> p[i] >> w[i] >> d[i];
        l = max(l, p[i]);
        r = min(r, p[i]);
    }

    int ans = INT64_MAX;

    for (int i=0; i<60; i++) {
        int m = (r - l) / 3;
        int m1 = l + m;
        int m2 = r - m;
        int x1 = time(m1);
        int x2 = time(m2);
        ans = min(ans, min(x1, x2));
        if (x1 > x2) l = m1;
        else r = m2;
    }

    cout << ans << '\n';
    
    return 0;
}