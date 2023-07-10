#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;


int grid[2][2] = {{1, 2}, {3, 4}};
string s;

int32_t main() {

    boost();
   
    cin >> s;
    for (int i=0; i<s.length(); i++) {
        if (s[i] == 'H') swap(grid[0], grid[1]);
        else {
            swap(grid[0][0], grid[0][1]);
            swap(grid[1][0], grid[1][1]);
        }
    }

    for (int i=0; i<2; i++) {
        for (int j=0; j<2; j++) cout << grid[i][j] << ' ';
        cout << '\n';
    }

    return 0;
}