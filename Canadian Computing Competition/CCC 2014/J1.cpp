#include<bits/stdc++.h>
using namespace std;

int x, y, z;

string solve(int a, int b, int c) {
    if ((a + b + c) != 180)
        return "Error";
    if (a == b && a == c && a == 60) 
        return "Equilateral";
    if (a == b && a != c || b == c && b != a || a == c && a != b)
        return "Isosceles";
    else return "Scalene";
}

int main() {
    cin >> x >> y >> z;
    string ans = solve(x, y, z);
    cout << ans << '\n';
}