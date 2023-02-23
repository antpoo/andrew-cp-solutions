#include <bits/stdc++.h>
using namespace std;

const int MC = 200005;
int black[2][MC];

int main() {

    int c;
    cin >> c;
    int cnt1 = 0, cnt2 = 0;
    for (int i=0; i<2; i++) {
        for (int j=1; j<=c; j++) {
            cin >> black[i][j];
            if (black[i][j]) {
                cnt1++;
                if (i && j % 2 && black[i-1][j]) cnt2++;
                if (j-1 && black[i][j-1]) cnt2++;
            }
        }
    }

    cout << cnt1 * 3 - cnt2 * 2 << '\n';

    return 0;
}