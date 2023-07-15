#include <bits/stdc++.h>
#define int long long
#define pii pair<int, int>
#define f first
#define s second
#define pb push_back
#define boost() cin.tie(0), cin.sync_with_stdio(0)
using namespace std;

int ans; 
map<char, int> rom;

int32_t main() {

    boost();

    
    rom['I'] = 1;
    rom['V'] = 5;
    rom['X'] = 10;
    rom['L'] = 50;
    rom['C'] = 100;
    rom['D'] = 500;
    rom['M'] = 1000;

    string s; cin >> s;
    char last = 'M';
    for (int i=s.length()-2; i>=0; i-=2) {
        //cout << s[i] << ' ' << s[i+1] << '\n';
        if (i < s.length() - 3 && rom[s[i+3]] > rom[s[i+1]]) ans -= (int)(s[i] - '0') * rom[s[i+1]];
        else ans += (int)(s[i] - '0') * rom[s[i+1]];
        last = s[i+1];
    }

    cout << ans << '\n';

    return 0;
}