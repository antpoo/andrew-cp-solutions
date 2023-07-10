#include <iostream>
using namespace std;

int p, n, r, day = 0, sum;

int main() {
 
  cin >> p >> n >> r;
  sum = n;

  while(true) {
    n *= r;
    sum += n;
    day++;
    if (sum > p) {
      break;
    }
  }
  cout << day << endl;
}