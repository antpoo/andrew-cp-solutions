#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

const int MXY = 100005;

int x, y, g, ans;
string name, together[MXY][2], away[MXY][2];
map<string, int> group;

int32_t main() {

    boost();
    
    cin >> x;
    for (int i=0; i<x; i++) {
        cin >> together[i][0] >> together[i][1];
    }

    cin >> y;
    for (int i=0; i<y; i++) {
        cin >> away[i][0] >> away[i][1];
    }

    cin >> g;
    for (int i=0; i<g; i++) {
        cin >> name;
        group[name] = i;
        cin >> name;
        group[name] = i;
        cin >> name;
        group[name] = i;
    }

    for (int i=0; i<x; i++) {
        if (group[together[i][0]] != group[together[i][1]]) {
            ans++;
        }
    }

    for (int i=0; i<y; i++) {
        if (group[away[i][0]] == group[away[i][1]]) {
            ans++;
        }
    }

    cout << ans << '\n';
    
    return 0;
}