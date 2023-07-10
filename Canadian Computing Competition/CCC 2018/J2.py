n = int(input())

row1 = input()
row2 = input()

ans = 0

for i in range(n):
    if row1[i] == row2[i] == 'C':
        ans += 1

print(ans)