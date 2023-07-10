n=int(input())

for l in range(n):
    c=input()
    counter = 0
    for i in range(len(c)):
        counter += 1
        if i < len(c) - 1:
            if c[i] != c[i+1]:
                print(counter, c[i], end = ' ')
                counter = 0
        else:
            print(counter, c[i])