#include <bits/stdc++.h>
using namespace std;

const int MN = 5005;
int h[MN], dp[MN][MN]; 
int ans[MN];

int main() {

    int n;
    cin >> n;
    for (int i=1; i<=n; i++) cin >> h[i];

    for (int i=1; i<=n; i++) ans[i] = INT32_MAX;
    for (int i=1; i<=n; i++) {
        for (int j=1; j<=n-i+1; j++) {
            if (i == 1) dp[i][j] = 0;
            else if (i == 2) dp[i][j] = abs(h[j+1] - h[j]);
            else dp[i][j] = dp[i-2][j+1] + abs(h[j] - h[j+i-1]);
            ans[i] = min(ans[i], dp[i][j]);
        }
    }
    
    for (int i=1; i<=n; i++) cout << ans[i] << ' ';
        
    cout << '\n';

    return 0;
}