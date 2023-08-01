#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

struct computer {
    string name;
    int r, s, d;
};

bool cmp(computer a, computer b) {
    int aval = 2 * a.r + 3 * a.s + a.d;
    int bval = 2 * b.r + 3 * b.s + b.d;
    if (aval == bval) return a.name < b.name;
    return aval > bval;
}


int32_t main() {

    boost();
    
    int n; cin >> n;
    vector<computer> v;
    for (int i=0; i<n; i++) {
        string name; int r, s, d;
        cin >> name >> r >> s >> d;
        v.push_back({name, r, s, d});
    }
    if (!n) return 0;
    if (n == 1) {cout << v[0].name << '\n'; return 0;}

    sort(v.begin(), v.end(), cmp);

    

    cout << v[0].name << '\n' << v[1].name << '\n';


    return 0;
}