a = int(input())
b = int(input())

cool_num = 0
count = 0

while cool_num ** 6 <= b:
    if cool_num ** 6 >= a:
        count += 1
    cool_num += 1

print(count)