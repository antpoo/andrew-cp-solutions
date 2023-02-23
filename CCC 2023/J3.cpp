#include <bits/stdc++.h>
using namespace std;

int people[6];

int main() {

    int n;
    cin >> n;
    for (int i=0; i<n; i++) {
        string interested;
        cin >> interested;
        for (int j=0; j<5; j++) {
            if (interested[j] == 'Y') {
                people[j+1]++;
            }
        }
    }

    int most_people = 0;
    for (int i=1; i<=5; i++) {
        most_people = max(most_people, people[i]);
    }

    bool first = 1;
    for (int i=1; i<=5; i++) {
        if (people[i] == most_people) {
            if (first) {
                cout << i;
                first = 0;
            }
            else {
                cout << ',' << i;
            }
        }
    }

    cout << '\n';

    return 0;
}