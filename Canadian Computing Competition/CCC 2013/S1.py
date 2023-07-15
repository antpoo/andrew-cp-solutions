
y = int(input())
while True:
    hset = []
    y += 1
    year = str(y)
    for c in year:
        hset.append(c)
    hset = set(hset)
    if len(hset) == len(year):
        print(y)
        break