#include <bits/stdc++.h>
#define int long long 
#define String string
#define pii pair<int, int>
#define tiii tuple<int, int, int>
using namespace std;

int a, b, c, d, e, f;

int32_t main() {
    
    cin >> a >> b >> c >> d >> e >> f;
    int ascore = a * 3 + b * 2 + c;
    int bscore = d * 3 + e * 2 + f;
    
    (ascore > bscore) ? cout << "A\n" : (bscore > ascore) ? cout << "B\n" : cout << "T\n";
}