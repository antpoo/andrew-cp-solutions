question = int(input())
N = int(input())
Dmoj = list(map(int, input().split()))
Peg = list(map(int, input().split()))

Dmoj.sort()

if question == 1:
    Peg.sort()
else:
    Peg.sort(reverse = True)

sum = 0

for i in range(N):
    sum += max(Dmoj[i], Peg[i])

print(sum)