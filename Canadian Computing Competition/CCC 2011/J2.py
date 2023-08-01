
import sys
def A(h, t):
    return - 6 * t ** 4 + h * t ** 3 + 2 * t ** 2 + t

h = int(input())
m = int(input())

for i in range(1, m + 1):
    altitude = A(h, i)
    if altitude <= 0:
        print("The balloon first touches ground at hour:")
        print(i)
        sys.exit()
print("The balloon does not touch ground in the given time.")