n = int(input())

x1, y1, x2, y2 = 105, 105, 0, 0

for i in range(n):
    x, y = map(int, input().split(','))

    x1 = min(x1, x)
    y1 = min(y1, y)

    x2 = max(x2, x)
    y2 = max(y2, y)

print(x1 - 1, y1 - 1, sep=',')
print(x2 + 1, y2 + 2, sep=',')