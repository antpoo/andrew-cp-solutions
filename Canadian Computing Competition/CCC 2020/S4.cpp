#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

int n;

struct section {
    int a = 0, b = 0, c = 0;
    void add(char group) {
        if (group == 'A') a++;
        else if (group == 'B') b++;
        else if (group == 'C') c++;
    }
    void remove(char group) {
        if (group == 'A') a--;
        else if (group == 'B') b--;
        else if (group == 'C') c--;
    }
};

int solve(string &s) {
    section total;
    for (int i=0; i<n; i++) total.add(s[i]);
    section a, b, c;
    int j = 0;
    for (int i=0; i<total.a; i++) {
        a.add(s[j]);
        j++;
    }
    for (int i=0; i<total.b; i++) {
        b.add(s[j]);
        j++;
    }
    for (int i=0; i<total.c; i++) {
        c.add(s[j]);
        j++;
    }
    int min_swaps = INT_MAX;
    for (int i=0; i<n; i++) {
        int swaps = a.b + a.c + b.a + b.c - min(a.b, b.a);
        min_swaps = min(swaps, min_swaps);
        a.remove(s[i]);
        a.add(s[i + total.a]);
        b.remove(s[i + total.a]);
        b.add(s[i + total.a + total.b]);
        c.add(s[i + total.a + total.b]);
        c.remove(s[i + total.a + total.b + total.c]);
    }
    return min_swaps;
}

int32_t main() {

    boost();

    string s;
    cin >> s;
    n = s.size();
    s += s;
    int ans = solve(s);
    for (int i=0; i<s.size(); i++) {
        if (s[i] == 'A') s[i] = 'C';
        else if (s[i] == 'C') s[i] = 'A';
    }

    ans = min(ans, solve(s));
    cout << ans << '\n';
    
    return 0;
}