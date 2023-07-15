#include<bits/stdc++.h>
using namespace std;

const int MN = 27;
int R, C, K, r, c, dp[MN][MN];
bool cat[MN][MN];

int main() {
   cin >> R >> C >> K;
   while (K--) {
       cin >> r >> c;
       cat[r][c] = true;
   }
   dp[1][1] = 1;
   for (int i=1; i<=R; i++) {
       for (int j=1; j<=C; j++) {
           if (!cat[i][j]) {
               dp[i][j] += dp[i-1][j] + dp[i][j-1];
           }
       }
   }
   
   cout << dp[R][C] << '\n';
   
   return 0;
   
}