n,  score = int(input()), 0
student = [input() for i in range(n)]
for x in range(n): 
    if student[x] == input(): score += 1
print(score)