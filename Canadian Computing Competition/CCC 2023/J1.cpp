#include <bits/stdc++.h>
using namespace std;

int main() {

    int p, c;
    cin >> p >> c;
    cout << p * 50 - c * 10 + (p > c) * 500 << '\n';

    return 0;
}