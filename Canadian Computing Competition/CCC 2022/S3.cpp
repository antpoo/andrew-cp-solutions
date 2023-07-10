#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

vector<int> piece;
int n, m, k;

int32_t main() {

    boost();
    
    cin >> n >> m >> k;
    for (int i=0; i<n; i++) {
        int rem = n - i - 1;
        int dum = min(k - rem, m);
        if (dum <= 0) break;
        int val = 0;
        if (dum > i) {
            val = min(m, i + 1);
            dum = val;
        }
        else {
            val = piece[i-dum];
        }
        piece.push_back(val);
        k -= dum;
    }

    if (k == 0 && piece.size() == n) {
        for (int i : piece) {
            cout << i << ' ';
        }
        cout << '\n';
    }

    else cout << -1 << '\n';

    
    
    return 0;
}