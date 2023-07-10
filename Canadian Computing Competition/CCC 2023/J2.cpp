#include <bits/stdc++.h>
using namespace std;

int main() {

    map<string, int> pepper;
    pepper["Poblano"] = 1500;
    pepper["Mirasol"] = 6000;
    pepper["Serrano"] = 15500;
    pepper["Cayenne"] = 40000;
    pepper["Thai"] = 75000;
    pepper["Habanero"] = 125000;

    int n;
    cin >> n;
    int ans = 0;
    while (n--) {
        string s;
        cin >> s;
        ans += pepper[s];
    }

    cout << ans << '\n';

    return 0;
}