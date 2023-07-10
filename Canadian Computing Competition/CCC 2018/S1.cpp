#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

int n;
vector<double> villages;

int32_t main() {

    boost();
    
    cin >> n;
    villages.resize(n);

    for (int i=0; i<n; i++) cin >> villages[i];

    sort(villages.begin(), villages.end());

    double ans = INT32_MAX;

    for (int i=1; i<n-1; i++) {
        double left = abs(villages[i] - villages[i-1]) / 2, right = abs(villages[i] - villages[i+1]) / 2;
        ans = min(left + right, ans);
    }

    printf("%.1f", ans);
    cout << '\n';

    return 0;
}