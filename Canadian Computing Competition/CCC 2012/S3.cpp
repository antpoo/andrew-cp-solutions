#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define pb push_back
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MN = 2000005;
int n, r, freq[1005];
vector<pii> readings;

bool cmp(pii a, pii b) {
    if (a.s == b.s) return a.f < b.f;
    return a.s > b.s;
}

int32_t main() {

    boost();

    cin >> n;
    for (int i=0; i<n; i++) {
        cin >> r;
        freq[r]++;
    }

    for (int i=1; i<=1000; i++) {
        if (freq[i]) readings.pb({i, freq[i]});
    }

    sort(readings.begin(), readings.end(), cmp);

    int sf = readings[1].s;


    int ans = 0;
    for (int i=1; i<readings.size(); i++) {
        if (readings[i].s != sf) break;
        ans = max(ans, abs(readings[0].f - readings[i].f));
    }

    cout << ans << '\n';

    return 0;
}