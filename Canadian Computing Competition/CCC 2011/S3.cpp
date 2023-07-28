#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define pb push_back
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

int t;

int fpow(int b, int p) {
    if (p == 0) return 1;
    int half = fpow(b, p/2);
    if (p % 2 == 0) return half * half;
    return half * half * b;
}

bool solve(int level, int x, int y) {
    
    if (level == 1) {
        if (y == 0 && (x == 1 || x == 2 || x == 3)) return 1;
        else if (y == 1 && x == 2) return 1;
        else return false;
    }

    int newx = x / fpow(5, level - 1), newy = y / fpow(5, level - 1);

    if (newx < 1 || newx > 3 || newy > 2) return false;
    else if (!newy) return true;
    else if (newx == 2 && newy == 1) return true; 

    newx *= fpow(5, level - 1), newy *= fpow(5, level - 1);

    return solve(level - 1, x - newx, y - newy);

}

int32_t main() {

    boost();
    
    cin >> t;

    while (t--) {
        int m, x, y;
        cin >> m >> x >> y;

        cout << (solve(m, x, y) ? "crystal" : "empty") << '\n';
    }
    
    return 0;
}