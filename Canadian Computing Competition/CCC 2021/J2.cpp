#include <iostream>
using namespace std;

const int MN = 105;
int n, bidAmt[MN], MAX = INT32_MIN;
string name[MN];

int main() {
  
  cin >> n;

  for (int i=0; i<n; i++) {
    cin >> name[i] >> bidAmt[i];
  }

  for (int i=0; i<n; i++) {
    if (MAX < bidAmt[i]) MAX = bidAmt[i];
  }

  for (int i=0; i<n; i++) {
    if (MAX == bidAmt[i]) {
      cout << name[i] << endl;
      return 0;
    }
  }

}