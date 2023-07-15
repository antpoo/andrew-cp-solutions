#include <bits/stdc++.h>
using namespace std;

int a, b, c, d;

int main() {
    
    cin >> a >> b >> c >> d;
    
    if (a < b && b < c && c < d)
        cout << "Fish Rising" << '\n';
    else if (a > b && b > c && c > d)
        cout << "Fish Diving" << '\n';
    else if (a == b && b == c && c == d)
        cout << "Fish At Constant Depth" << '\n';
    else
        cout << "No Fish" << '\n';
    
}