#include <bits/stdc++.h>
#define pii pair<int, int>
#define f first
#define s second
using namespace std;

const int MN = 105;
string word;
char grid[MN][MN];
map<char, int> mp;
pii directions[8] = {{0, 1}, {1, 0}, {1, 1}, {0, -1}, {-1, 0}, {-1, -1}, {-1, 1}, {1, -1}};

int found(pii cur, pii dir, char cur_char, bool bent) {
    int ret = 0;
    int r = cur.f, c = cur.s;
    if (mp[cur_char] == word.length() - 1) return 1;
    char next_char = word[mp[cur_char] + 1];
    if (grid[r + dir.f][c + dir.s] == next_char) {
        ret += found({r + dir.f, c + dir.s}, dir, next_char, bent);
    }
    if (!bent && mp[cur_char]) {
        if (dir.f && !dir.s) {
            if (grid[r][c + 1] == next_char) {
                ret += found({r, c + 1}, {0, 1}, next_char, 1);
            }
            if (grid[r][c-1] == next_char) {
                ret += found({r, c - 1}, {0, -1}, next_char, 1);
            }
        }
        else if (!dir.f && dir.s) {
            if (grid[r + 1][c] == next_char) {
                ret += found({r + 1, c}, {1, 0}, next_char, 1);
            }
            if (grid[r - 1][c] == next_char) {
                ret += found({r - 1, c}, {-1, 0}, next_char, 1);
            }
        }
        else if (dir.f == dir.s && dir.f) {
            if (grid[r - 1][c + 1] == next_char) {
                ret += found({r - 1, c + 1}, {-1, 1}, next_char, 1);
            }
            if (grid[r + 1][c - 1] == next_char) {
                ret += found({r + 1, c - 1}, {1, -1}, next_char, 1);
            }
        }
        else if (dir.f && dir.s) {
            if (grid[r + 1][c + 1] == next_char){
                ret += found({r + 1, c + 1}, {1, 1}, next_char, 1);
            }
            if (grid[r - 1][c - 1] == next_char) {
                ret += found({r - 1, c - 1}, {-1, -1}, next_char, 1);
            }
        } 
    }
    return ret;
}

int main() {

    cin >> word;
    for (int i=0; i<word.length(); i++) mp[word[i]] = i;
    int r, c;
    cin >> r >> c;
    for (int i=1; i<=r; i++) {
        for (int j=1; j<=c; j++) {
            cin >> grid[i][j];
        }
    }

    int ans = 0;
    for (int i=1; i<=r; i++) {
        for (int j=1; j<=c; j++) {
            if (grid[i][j] == word[0]) {
                for (pii dir : directions) {
                    ans += found({i, j}, dir, word[0], 0);

                }
            }
        }
	}

    cout << ans << '\n';

    return 0;
}