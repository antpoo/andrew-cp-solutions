#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MN = 105;

int n, grid[MN][MN];


int32_t main() {

    boost();
    
    cin >> n;
    for (int i=0; i<n; i++) for (int j=0; j<n; j++) cin >> grid[i][j];

    int tl = grid[0][0], tr = grid[0][n-1], bl = grid[n-1][0], br = grid[n-1][n-1];

    if (tl < tr && tl < bl && tl < br) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) cout << grid[i][j] << ' ';
            cout << '\n';
        }
    }

    else if (tr < tl && tr < bl && tr < br) {
        for (int i=n-1; i>=0; i--) {
            for (int j=0; j<n; j++) cout << grid[j][i] << ' ';
            cout << '\n';
        }
    }

    else if (br < tl && br < bl && br < tr) {
        for (int i=n-1; i>=0; i--) {
            for (int j=n-1; j>=0; j--) cout << grid[i][j] << ' ';
            cout << '\n';
        }
    }

    else {
        for (int i=0; i<n; i++) { 
            for (int j=n-1; j>=0; j--) cout << grid[j][i] << ' ';
            cout << '\n';
        }
    }

    return 0;
}