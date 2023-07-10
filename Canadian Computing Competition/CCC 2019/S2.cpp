#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

bool prime[(int)1e7];

void sieve() {
    for (int i=0; i<1e7; i++) prime[i] = 1;
    for (int i=2; i<sqrt(1e7); i++) {
        if (prime[i]) for (int j=i*i; j<1e7; j+=i) prime[j] = 0;
    }
}

int t, n;

int32_t main() {

    boost();
    
    sieve();

    
    cin >> t;
    while (t--) {
        cin >> n;
        for (int i=0; i<n; i++) {
            if (prime[n+i] && prime[n-i]) {
                cout << n + i << ' ' << n - i << '\n';
                break;
            }
        }
    }

    return 0;
}